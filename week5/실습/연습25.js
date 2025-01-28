// Rest Parameter 함수파라미터 펼치기

function foo(first, ...rest) {
  console.log(rest);
  console.log(...rest);
}
foo(1, 2, 3, 4);
