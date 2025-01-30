const products = [
  {
    category: "Graphic Card",
    name: "GeForce RTX 4090",
    price: 400000,
  },
  {
    category: "Shoes",
    name: "Nike Air Max 97 Triple White",
    price: 200000,
  },
];

const product_to_add_1 = {
  category: "Notebook",
  name: "MacBook Air 15 M3, 16GB",
  price: 2200000,
};

const product_to_add_2 = {
  category: "Food",
  name: "Cavendish & Harvey Sour Cherry",
  price: 5000,
};

function add(list, element_to_add) {
  const newList = JSON.parse(JSON.stringify(list));
  newList.push(element_to_add);
  return newList;
}

const updated = add(products, product_to_add_1);
console.log(updated);
