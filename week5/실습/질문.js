const date = new Date(2025, 0, 1).getDate(); // 1월의 마지막 날짜가 안나와요
console.log("출력합니다");
console.log(date);

const k = new Date();
console.log(k.getHours());

const date1 = new Date(2025, 1, 0);
const timestamp = date1.getTime();
console.log(timestamp);
console.log(date1);

function convert(user) {
  const converted_user = {
    name: user.name,
    age: user.age,
    address: user.address || { location: "입력없음" }, // address가 falsy면 기본값 설정
    job: user.job || "직장없음",
  };
  return converted_user;
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
const converted_users = [];
for (let i = 0; i < result.body.length; i++) {
  const converted_user = convert(result.body[i]);
  converted_users.push(converted_user);
}
console.log(converted_users);

// <!DOCTYPE html>
// <html lang="en">
//   <head>
//     <meta charset="UTF-8" />
//     <meta name="viewport" content="width=device-width, initial-scale=1.0" />
//     <title>Option Select</title>
//   </head>
//   <body>
//     <select name="category" onchange="selected(this.value)">
//       <option value="computer">부품</option>
//       <option value="cloth">옷</option>
//       <option value="shoes">신발</option>
//     </select>
//     <script>
//       const products = {
//         'COMPUTER': [
//           { name: 'GeForce RTX 4090' },
//           { name: 'AMD 9600X' },
//           { name: 'Intel i7-14700K' },
//         ],
//         'CLOTH': [
//           { name: 'Alpha Industries MA-1' },
//           { name: 'Acne Studios Shearling Jacket' },
//         ],
//         'SHOES': [
//           { name: 'Nike Air Max 97 Triple White' },
//           { name: 'Dr.Martens 1461 Leather Oxford' },
//         ],
//       }
//       function selected(value) {
//         const selected_products = []
//         console.log(products[value.toUpperCase()]);
//       }
//     </script>
//   </body>
// </html>
