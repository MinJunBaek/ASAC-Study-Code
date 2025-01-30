class Database {
  constructor() {
    this.data = [];
  }

  save({
    name = "이름없음",
    email = "이메일없음",
    age = 1,
    job = "직업없음",
    specialty = "전문없음",
  }) {
    const employee = {
      name,
      email,
      age,
      job,
      specialty,
    };
    this.data.push(employee);
  }
}

const users = new Database();
const json = [
  {
    name: "Aaron",
    email: "aaron@gmail.com",
    age: 10,
    job: "Developer",
    specialty: "Backend",
  },
  {
    name: "Baron",
    email: "baron@gmail.com",
    age: 20,
    job: "Designer",
  },
  {
    name: "Caron",
    email: "caron@gmail.com",
    age: 30,
  },
  {
    name: "Daron",
    age: 40,
  },
];
json.map((each) => users.save(each));
console.log(users.data);
