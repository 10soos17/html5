//=============btn_top, bottom====================================================
animateScrollTo = function (_wrap, _selector, thisY, _duration, _adjust) {
  // - Get current &amp; target positions
  //const scrollEle = document.querySelector("#wrap"); // || document.scrollingElement;
  const scrollEle = document.querySelector(_wrap); // || document.scrollingElement;
  currentY = scrollEle.scrollTop;

  console.log("_selector___:", _selector, "_wrap:", _wrap);

  if (!_selector) {
    //return;
    targetY = thisY;
    //console.log("document.documentElement:",document.documentElement,"window.scrollingElement:",window.scrollingElement);

    //console.log("scrollEle:",scrollEle,"currentY:",currentY,"targetY:",targetY);
    animateScrollTo(currentY, targetY, _duration);
  } else {
    const targetEle = document.querySelector(_selector);
    targetY = targetEle.offsetTop - (_adjust || 0);

    console.log("targetEle:", targetEle, "targetY:", targetY);

    //console.log("document.documentElement:",document.documentElement,"window.scrollingElement:",window.scrollingElement);

    //console.log("scrollEle:",scrollEle,"currentY:",currentY,"targetY:",targetY);
    animateScrollTo(currentY, targetY, _duration);
  }

  // - Animate and scroll to target position
  function animateScrollTo(_startY, _endY, _duration) {
    _duration = _duration ? _duration : 600;
    const unitY = (targetY - currentY) / _duration;
    const startTime = new Date().getTime();
    const endTime = new Date().getTime() + _duration;

    console.log(
      "_duration:",
      _duration,
      "unitY:",
      unitY,
      "startTime:",
      startTime,
      "endTime:",
      endTime
    );

    const scrollTo = function () {
      let now = new Date().getTime();
      let passed = now - startTime;

      if (now <= endTime) {
        scrollEle.scrollTop = currentY + unitY * passed;
        requestAnimationFrame(scrollTo);
      } else {
        console.log("End off.");
      }
    };
    requestAnimationFrame(scrollTo);
  }
};

//=============btn_search - key event(ctrl + f)======================================

document.addEventListener("keydown", keyPressed, false);
document.addEventListener("keyup", keyReleased, false);

let keys = [];

function keyPressed(e) {
  keys[e.keyCode] = true;
  let searchBox = document.getElementById("searchBox");
  let searchText = document.getElementById("search_text");

  //=====ctrl + f
  if (keys[17] && keys[70]) {
    e.preventDefault();
    searchBox.style.display = "flex";

    //=====esc (= function search_close)
  } else if (keys[27]) {
    e.preventDefault();
    searchText.value = "";
    $("#search_number").attr("value", `${0}/${0}`);
    searchBox.style.display = "none";
  }

  /*//=====enter
    }else if(keys[13]){

        e.preventDefault();
        let thisText =searchText.value;
        console.log("thisText:___",thisText);

        //searchArticle(thisText);
    

    }*/
}

function keyReleased(e) {
  keys[e.keyCode] = false;
}

function searchArticle(thisText) {
  var searchTerm = $(search_text).val();
  console.log(searchTerm);

  $("#article").unmark().mark(searchTerm, {
    acrossElements: true,
    separateWordSearch: false,
  });
  /*
    // let lowerText = thisText.toLowerCase();
    let regExp = new RegExp(thisText, 'gi'); //'gi'

    console.log('regExp_______:',regExp);
    
    let article = document.getElementById("article").children;
    let text = '';
    // console.log(article);
    for(let i=0; i < article.length; i++){
        text += article[i].innerHTML.toLowerCase();
    }

    console.log("text___:",text);

    let res = text.match(regExp);

    console.log('res_______:',res,"text.length",text.length);

    let num = res.length;
    let count = 0;
    let indexNum = 0;
    let indexList = [];

    let resres = text.map(thisText);
    console.log("resres:",resres);

    */
}

//=====================search Text Highlight & save mark's offsetTop
//let count=0;
let resList = [];
let markList = [];

$(function () {
  $("#search_text")
    .on("input.highlight", function () {
      // Determine specified search term
      var searchTerm = $(this).val();

      // Highlight search term inside a specific context
      let res = $(".container").unmark().mark(searchTerm, {
        acrossElements: true,
        separateWordSearch: false,
      });

      let resAll = res.children().context.all;

      for (let i = 0; i < resAll.length; i++) {
        if (resAll[i].tagName === "MARK") {
          resList.push(resAll[i].offsetTop - 50);
          // console.log("i______:",i,"resAll[i]______:",resAll[i]);
          //console.log("resList___:",resList);
        }
      }

      if (resList.length !== 0) {
        console.log("resList.length___:", resList.length);
        $("#search_number").attr("value", `${1}/${resList.length}`);
        animateScrollTo("", resList[0]);
      }

      markList = resList;
      resList = [];
    })
    .trigger("input.highlight")
    .focus();
});

//=====================search close (= esc key)==========================================
function search_close() {
  $("#search_text").attr("value", "");
  $("#search_number").attr("value", `${0}/${0}`);
  searchBox.style.display = "none";
}

//=====================search up=========================================================
function search_up() {
  let thisMark = $("#search_number").val();

  thisMark = thisMark.split("/");
  thisMark = Number(thisMark[0]);
  console.log("thisMark___:", thisMark, "resList.length___:", markList.length);

  if (1 < thisMark && thisMark <= markList.length) {
    $("#search_number").attr("value", `${thisMark - 1}/${markList.length}`);
    animateScrollTo("", markList[thisMark - 2]);
  } else {
    return;
  }
}
//=====================search down========================================================
function search_down() {
  let thisMark = $("#search_number").val();

  thisMark = thisMark.split("/");
  thisMark = Number(thisMark[0]);
  console.log("thisMark___:", thisMark, "resList.length___:", markList.length);

  if (1 <= thisMark && thisMark < markList.length) {
    $("#search_number").attr("value", `${thisMark + 1}/${markList.length}`);
    animateScrollTo("", markList[thisMark]);
  } else {
    return;
  }
}

/*나중에 server set 후, 파일 읽고 뿌리기 https://backback.tistory.com/268
function get_article(){
    let obj = $("#article_title");

    obj.html("what");
    console.log(obj);
}*/
