const resultInput = document.querySelector(".input");

const clearButton = document.querySelector(".clear");

const plusButton = document.querySelector("#plus");

const minusButton = document.querySelector("#minus");

const divideButton = document.querySelector("#divide");

const multiplyButton = document.querySelector("#multiply");

const calculateButton = document.querySelector("#calculate");

let temp;
let operator;

plusButton.addEventListener("click", () => {
  console.log("click");
  if (resultInput.value) {
    temp = parseInt(resultInput.value);
    operator = "+";
    resultInput.value = null;
  }
});

minusButton.addEventListener("click", () => {
  if (resultInput.value) {
    temp = parseInt(resultInput.value);

    operator = "-";

    resultInput.value = null;
  }
});

divideButton.addEventListener("click", () => {
  if (resultInput.value) {
    temp = parseInt(resultInput.value);

    operator = "/";

    resultInput.value = null;
  }
});

multiplyButton.addEventListener("click", () => {
  if (resultInput.value) {
    temp = parseInt(resultInput.value);

    operator = "*";

    resultInput.value = null;
  }
});

clearButton.addEventListener("click", () => {
  resultInput.value = "";

  temp = null;

  operator = null;
});

calculateButton.addEventListener("click", () => {
  if (operator === "+") {
    resultInput.value = temp + parseInt(resultInput.value);
  } else if (operator === "-") {
    resultInput.value = temp - parseInt(resultInput.value);
  } else if (operator === "*") {
    resultInput.value = temp * parseInt(resultInput.value);
  } else if (operator === "/") {
    resultInput.value = temp / parseInt(resultInput.value);
  }
});
