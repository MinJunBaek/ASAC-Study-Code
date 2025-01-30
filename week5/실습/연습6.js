console.log(true && true); // t
console.log(true && false); // f
console.log(false && true); // f
console.log(false && false); // f

console.log(true || true); // t
console.log(true || false); // t
console.log(false || true); // t
console.log(false || false); // f

const result = false || false ? "경고" : null;
console.log(result);

let typedName = "";
console.log(!!typedName);
typedName = "Tom";
console.log(!!typedName);
