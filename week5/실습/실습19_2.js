const jobs = {
  DEVELOPER: {
    name: "개발자",
    salary: 250,
  },
  PRODUCT_OWNER: {
    name: "기획자",
    salary: 200,
  },
  PRODUCT_MANAGER: {
    name: "관리자",
    salary: 300,
  },
  DESIGNER: {
    name: "디자이너",
    salary: 180,
  },
};

const locations = {
  EARTH: {
    name: "지구",
    resource: "동식물",
  },
  MOON: {
    name: "달나라",
    resource: "철광석",
  },
  MARS: {
    name: "화성",
    resource: "적색토",
  },
};

const users = [
  {
    name: "Aaron",
    age: 10,
    job: "Developer",
    address: {
      location: "Earth",
    },
  },
  {
    name: "Baron",
    age: 20,
    job: "Product Owner",
  },
  {
    name: "Caron",
    age: 30,
    job: null,
    address: {
      location: "Moon",
    },
  },
];

function toString(users) {
  const { name, age, job, address } = users;

  // 직업정보 뽑기
  const jobKey = job ? job.toUpperCase().replace(" ", "_") : "무직";
  const jobInfo = jobs[jobKey] ? jobs[jobKey].name : jobKey;

  // 주소 뽑기
  const addressKey = address ? address.location.toUpperCase() : "어딘가";
  const addressInfo = locations[addressKey]
    ? locations[addressKey].name
    : addressKey;

  return `해당 유저의 이름은 ${name}이고, 나이는 ${age}살 이며, 직업은 ${jobInfo}(이)고, ${addressInfo}에 삽니다`;
}

users.forEach((user) => console.log(toString(user)));
