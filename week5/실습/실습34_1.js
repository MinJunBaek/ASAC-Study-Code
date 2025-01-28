const api = require("./mock-api/test-tools/api");

async function main() {
  const promise = new Promise((resolve, reject) => {
    console.log("setTimeout 호출 직전");
    setTimeout(() => {
      console.log("setTimeout 호출 완료");
      resolve({
        id: 1,
        name: "Aaron",
        email: "aaron@gmail.com",
        age: 10,
      });
    }, 10000);
  });

  promise.then((result) => console.log(result));
  console.log("promise 대기");
}

main();
