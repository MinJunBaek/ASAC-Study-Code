const budget = 23000;
const favorites = ["chicken", "pizza"];
const foods = [
  {
    category: "chicken",
    name: "Hosik",
    price: 20000,
  },
  {
    category: "chicken",
    name: "Kentucky",
    price: 16000,
  },
  {
    category: "chicken",
    name: "BHC",
    price: 26000,
  },
  {
    category: "pizza",
    name: "Mr.Pizza",
    price: 26000,
  },
  {
    category: "pizza",
    name: "Pizza Hut",
    price: 30000,
  },
  {
    category: "meat",
    name: "MyeongRyun Jinsa",
    price: 15000,
  },
  {
    category: "meat",
    name: "Daedo Sikdang",
    price: 55000,
  },
];

const foodList = foods.map((food) => {
  if (favorites.includes(food.category) && food.price <= budget) {
    return food.name;
  }
});

const result = foodList.filter((item) => {
  return item;
  // ture값만 반환하고 false는 반환하지 않음
});
console.log(result.join(", "));
