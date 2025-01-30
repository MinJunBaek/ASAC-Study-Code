// 객체 생성
const person = {
    name:{
        firstName: "Gildong",
        lastName: "Hong"
    },
    age: 20,
    likes:["apple", "samsung"],
    isAdult:true,
    printInfo:function(){
        console.log('printInfo');
    },
    printHello:function(){
        return "hello";
    },
};

// 객체 접근방법 []
console.log("[] 연산자")
console.log(person["name"]);
console.log(person["name"]["firstName"]);
console.log(person["printHello"]());
console.log();

// 객체 접근방법 .(마침표)
console.log(". 연산자")
console.log(person.name);
console.log(person.likes[0]);
console.log(person.printHello());
console.log();

// 객체 속성값 변경하기
console.log("객체 속성값 변경하기");
person.age = 30;
console.log(person.age);
console.log();

// 객체 속성 동적으로 추가하기
console.log("객체 속성 동적으로 추가");
person["address"] = "서울";
console.log(person);

// 객체 속성 동적으로 삭제하기
console.log("객체 속성 동적으로 삭제");
delete person.address;
console.log(person);