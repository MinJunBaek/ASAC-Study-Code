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

const user = {
  name: "Aaron",
  age: 10,
  job: "Developer",
  address: {
    location: "Earth",
  },
};

const toString = ({ name, age, job }) => {
  // 직업정보를 탐색
  const jobInfo = jobs[job.toUpperCase()];
  // 직업정보를 기반으로 특정유저 추출
  const jobName = jobInfo ? jobInfo.name : "알 수 없음";
  return `해당 유저의 이름은 ${name}이고, 나이는 ${age}살 이며, 직업은 ${jobName}입니다.`;
};

console.log(toString(user));
