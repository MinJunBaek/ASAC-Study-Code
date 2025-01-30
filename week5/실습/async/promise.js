"use strict";

// state: pending(수행중) -> fulfilled(완료) or rejected(실패)
// Producer(생성자) vs Consumer(소비자)

// 1. Producer (생성되는 순간 바로 executor라는 함수가 바로 실행됨 한마디로 네트워크 요청을 하게됨.)
const promise = new Promise((resolve, reject) => {
  console.log("doing something...");
  setTimeout(() => {
    resolve("ellie");
    // reject(new Error("no network"));
  }, 2000);
});

// 2. Consumers(이용하는 자) : then, catch, finally
// 정상일때 (promise의 resolve 값이 then을 통해 콜백함수로 값이 넘어온다.)
promise
  .then((value) => {
    console.log(value);
  }) // 에러가 났을때 에러처리 (.then의 결과를 체이닝통해 catch결과를 등록)
  .catch((error) => {
    console.log(error);
  }) // 성공여부와 상관없이 호출됨
  .finally(() => {
    console.log("finally");
  });

// Promise chaining
const fetchNumber = new Promise((resolve, reject) => {
  setTimeout(() => resolve(1), 1000);
});

// .then 값전달, 혹은 Promise를 전달
fetchNumber
  .then((num) => num * 2)
  .then((num) => num * 3)
  .then((num) => {
    return new Promise((resolve, reject) => {
      setTimeout(() => resolve(num - 1), 1000);
    });
  })
  .then((num) => console.log(num));

// 4. Error Handling
const getHen = () =>
  new Promise((resolve, reject) => {
    setTimeout(() => resolve("🐓"), 1000);
  });

const getEgg = (hen) =>
  new Promise((resolve, reject) => {
    setTimeout(() => reject(new Error(` error! ${hen} => 🥚`)), 1000);
  });

const cook = (egg) =>
  new Promise((resolve, reject) => {
    setTimeout(() => resolve(`${egg} => 🍳`), 1000);
  });

getHen()
  .then(getEgg) // 생략가능
  .catch((error) => {
    return "🍞";
  })
  .then((egg) => cook(egg))
  .then((meal) => console.log(meal))
  .catch(console);

// promise는 값과 상태를 가지고 있다.

// useEffect는 값을 반환하려면 void 혹은 destructor를 반환해야 한다. 하지만 함수에 asyn를 붙이면 promise객체를 반환,
// 엑시노스는 직렬화, 역직렬화를 해준다. 하지만 feth를 쓰면 직접 직렬화와 역직렬화를 해야한다.
// promise객체를 꺼내려면 await
