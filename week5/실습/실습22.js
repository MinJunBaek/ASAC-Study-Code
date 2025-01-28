function convert(user) {
  const converted_user = {};

  converted_user.name = user.name;
  converted_user.age = user.age;
  if (user.address != null) {
    converted_user.address = user.address;
  }
  if (user.job != null) {
    converted_user.job = user.job;
  }
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
