// promise를 간결하게 만들어주는 기능

// clear style of using promise

// 1. async
async function fetchUser() {
  // do network reqeust in 10 secs.....
  return new Promise((resolve, reject) => {
    return "ellie";
  });
}

const user = fetchUser();
user.then(console.log);
console.log("안녕");

// 2. await
function delay(ms) {
  return new Promise((resolve) => setTimeout(resolve, ms));
}

async function getApple() {
  await delay(3000);
  return "🍎";
}

async function getBanana() {
  await delay(3000);
  return "🍌";
}

async function pickFruits() {
  // 비동기처리 apple와 banana는 아무 연관이 없음.
  const applePromise = getApple();
  const bananaPromis = getBanana();

  const apple = await applePromise;
  const banana = await bananaPromis;
  return `${apple} + ${banana}`;
}

pickFruits().then(console.log);

// 3. useful Promise APIs

function pickAllFruits() {
  return Promise.all([getApple(), getBanana()]).then((fruits) =>
    fruits.join(" + ")
  );
}

pickAllFruits.then(console.log());

function pickOnlyOne() {
  return Promise.race([getApple, getBanana]);
}
