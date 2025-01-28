let number = 10;
console.log(number);
let string = '문자열은 큰따옴표(\")나 작은 따옴표(\')로 감싸면 됩니다.\n';
console.log(string);

let temString = `템플릿 문자열 안에 변수(${number})를 넣을수 있다.`;
console.log(temString);

let empty;
console.log(empty);

let studentScoreArray = [80, 70, 90, 60];

console.log(studentScoreArray);

let studentScoreObject = {
    koreanScore: 80,
    englishScore: 70,
    mathScore: 90,
    scienceScore: 60
}

console.log(studentScoreObject);
console.log(studentScoreObject.koreanScore);
console.log(studentScoreObject['englishScore']);
console.log('' && 'b' && 0);
console.log(true && true);
console.log(true&&false&&true);
console.log("" && "cat");
console.log(undefined && "cat" && 0);
console.log("논리 연산자")
console.log(true || true);
console.log(true || false || true);
console.log("" || "cat" || "dog");
console.log(undefined || "cat");

let result = number *= 3;
console.log(number);
console.log(result);

switch (number) {
    case 10:
        console.log('10이다');
        break;

    case 20:
        console.log('20이다');
        break;

    case 30:
        console.log('30이다');

    default:
        console.log("기본적으로 실행한다.");
        break;
}

for (let i in studentScoreArray){
    console.log(studentScoreArray[i])
}

for (let i in studentScoreObject) {
    console.log(studentScoreObject[i]);
}