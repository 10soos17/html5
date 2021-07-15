package com.ja.finalproject.member.service;

import java.util.ArrayList;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ja.finalproject.member.mapper.MemberSQLMapper;

import com.ja.finalproject.vo.HobbyCategoryVo;
import com.ja.finalproject.vo.HobbyVo;
import com.ja.finalproject.vo.MemberVo;

//db

//root-context.xml

@Service
public class MemberServiceImpl {

	@Autowired // DI(setter 주입)
	private MemberSQLMapper memberSQLMapper;

	// ----Member table

	public void joinMember(MemberVo vo, int[] hobby_category_no) {

		int member_no = memberSQLMapper.createMemberPK();// pk 값을 먼저 생성
		vo.setMember_no(member_no);// pk 값을 설정

		memberSQLMapper.joinMember(vo);

		if (hobby_category_no == null) {
			return;
		}

		for (int hobby : hobby_category_no) {
			HobbyVo hobbyVo = new HobbyVo();
			hobbyVo.setHobby_category_no(hobby);
			hobbyVo.setMember_no(member_no);

			memberSQLMapper.registerHobby(hobbyVo);
		}
	}

	//
	public MemberVo login(MemberVo param) {

		MemberVo result = memberSQLMapper.getMemberByIdAndPw(param);

		return result;
	}

	// ----HobbyCategory table
	public ArrayList<HobbyCategoryVo> getHobbyCategoryList() {
		return memberSQLMapper.getCategoryList();
	}

	// ==========================================================================================
	// ===============self try
	public ArrayList<HobbyCategoryVo> getHobby(MemberVo vo) {

		ArrayList<HobbyCategoryVo> list = new ArrayList<>();

		ArrayList<Integer> hobbyList = memberSQLMapper.getHobby(vo.getMember_no());

		for (int hc_no : hobbyList) {
			HobbyCategoryVo hobbyCategoryVo = memberSQLMapper.getMyHobbyCategory(hc_no);
			if (hobbyCategoryVo != null) {
				list.add(hobbyCategoryVo);
				System.out.println(hobbyCategoryVo.getHobby_category_name());
			}
		}

		return list;
	}
	
	//
	public MemberVo updateMyInfo(MemberVo vo, int[] hobby_category_no) {

		memberSQLMapper.updateMyInfo(vo);

		int no = vo.getMember_no();

		if (hobby_category_no != null) {
			System.out.println("hobby_check start");
			ArrayList<Integer> hobbyList = memberSQLMapper.getHobby(vo.getMember_no());
			HashSet<Integer> addSet = new HashSet<>();
			HashSet<Integer> deleteSet = new HashSet<>();
			
//			if(hobbyList.size() == 0) {
//				hobbyList = new ArrayList<>();
//			}
			
			for (int i = 0; hobbyList.size() > i; i++) {

				for (int j = 0; hobby_category_no.length > j; j++) {
					if (hobbyList.get(i) == hobby_category_no[j]) {
						break;
					} else if (hobbyList.get(i) != hobby_category_no[j] && j == hobby_category_no.length - 1) {

						deleteSet.add(hobbyList.get(i));
						//System.out.println("deletSet: "+hobbyList.get(i));
					}
				}
			}

			for (int i = 0; hobby_category_no.length > i; i++) {

				for (int j = 0; hobbyList.size() > j; j++) {
					if (hobbyList.get(j) == hobby_category_no[i]) {
						break;
					} else if (hobbyList.get(j) != hobby_category_no[i] && j == hobbyList.size() - 1) {

						addSet.add(hobby_category_no[i]);
						//System.out.println("addSet: "+hobby_category_no[i]);
					}
				}
			}

			for (int del_no : deleteSet) {
				//System.out.println("delete: "+ del_no);
				HobbyVo hobbyVo = new HobbyVo();
				hobbyVo.setHobby_category_no(del_no);
				hobbyVo.setMember_no(no);

				memberSQLMapper.deleteHobby(hobbyVo);
			}

			for (int add_no : addSet) {
				//System.out.println("add: "+ add_no);
				HobbyVo hobbyVo = new HobbyVo();
				hobbyVo.setHobby_category_no(add_no);
				hobbyVo.setMember_no(no);

				memberSQLMapper.registerHobby(hobbyVo);
			}
		}
		
		MemberVo updateVo = memberSQLMapper.getMemberByNo(no);

		return updateVo;
	}
}