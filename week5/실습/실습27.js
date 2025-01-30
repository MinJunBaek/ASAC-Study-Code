const students = [
  {
    name: "Aaron",
    korean: 84,
    mathematics: 81,
    english: 50,
    science: 42,
  },
  {
    name: "Baron",
    korean: 0,
    mathematics: 100,
    science: 68,
  },
  {
    name: "Caron",
    korean: 0,
    mathematics: 25,
    english: 0,
    science: 100,
  },
  {
    name: "Daron",
    korean: 79,
    english: 24,
    science: null,
  },
];

students.forEach(({ name, korean, mathematics, english, science }) => {
  console.log(`> ${name}`);
  console.log(`- 국어 : ${korean ?? "응시하지 않음"}`);
  console.log(`- 수학 : ${mathematics ?? "응시하지 않음"}`);
  console.log(`- 영어 : ${english ?? "응시하지 않음"}`);
  console.log(`- 과학 : ${science ?? "응시하지 않음"}`);
});
