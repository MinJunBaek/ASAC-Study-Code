function convert({
  name = 이름없음,
  age = 1,
  address = "입력없음",
  job = "직장없음",
}) {
  const converted_user = {
    name: name,
    age: age,
    address: address || "입력없음",
    jog: job,
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

const converted_users = result.body.map((element) => convert(element));

console.log(converted_users);
