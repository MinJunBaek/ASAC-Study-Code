function convert(user) {
  // 각 프로퍼티의 접근??
  for (const key in user) {
    console.log(user[key]);
    // console.log(user[key]); // 왜 .으로 접근이 안되지?, 왜 []로 접근만 되지?
  }
  // 아직도 in과 of의 사용이 헷갈림.
  return user.age >= 10 ? user : null;
}
const result = {
  success: false,
  body: [
    {
      name: "Aaron",
      age: 10,
      address: null,
    },
    {
      name: "Baron",
      age: 20,
      address: {
        location: "Earth",
      },
    },
    {
      name: "Caron",
      age: 30,
      address: null,
      job: "Developer",
    },
  ],
};

// console.log(result.length); // 왜 2개가 아니지?

const converted_users = [];

// for문 작성
/*
for (let i = 0; i < result.body.length; i++) {
  const converted_user = convert(result.body[i]);
  converted_users.push(converted_user);
}
*/

// while문 작성
/*
let i = 0;
while (i < result.body.length) {
  const converted_user = convert(result.body[i++]); // 훗
  converted_users.push(converted_user);
}
*/

// 향상된 for문(of) 요넘은 객체 접근에 좋은것 같은디?
/*
for (e of result.body) {
  const converted_user = convert(e);
  converted_users.push(converted_user);
}
*/

// 향상된 for문(in)
for (index in result.body) {
  converted_users.push(convert(result.body[index]));
}
console.log(converted_users);
