function change(number) {
  let inch = (Number(number) / 254) * 100
  console.log(inch)
  ///254*100;
  let feet = inch / 12
  console.log(inch, feet)
  return inch, feet
}

function cal_volume(radius, height) {
  let volume = Number(radius) * 2 * 3.141592 * Number(height)
  console.log(volume)
  return volume
}

function seperate_number(number) {
  let first = parseInt(number / 1000)
  let second = parseInt((number % 1000) / 100)
  let third = parseInt(((number % 1000) % 100) / 10)
  let fourth = parseInt(((number % 1000) % 100) % 10)

  console.log(first, second, third, fourth)
}

function year(number) {
  let yearDic = {
    0: "원숭이띠",
    1: "닭띠",
    2: "개띠",
    3: "돼지띠",
    4: "쥐띠",
    5: "소띠",
    6: "범띠",
    7: "토끼띠",
    8: "용띠",
    9: "뱀띠",
    10: "말띠",
    11: "양띠",
  }
  let year = yearDic[number % 12]

  console.log(year)
  return year
}

function tree() {
  let star = ""
  for (let i = 0; i < 10; i++) {
    for (let j = 9 - i; j < 10; j++) {
      star += "*"
    }
    console.log(star)
    star = ""
  }
}

function factorial(num) {
  let number = num
  let res = num

  while (number != 1) {
    number -= 1
    res *= number
  }
  console.log(res)
  return res
}
