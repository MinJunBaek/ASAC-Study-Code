const carts = [
  {
    quantity: 2,
    product: {
      category: "Graphic Card",
      name: "GeForce RTX 4090",
    },
  },
  {
    quantity: 1,
    product: {
      category: "Shoes",
      name: "Nike Air Max 97 Triple White",
    },
  },
  {
    quantity: 3,
    product: {
      category: "Notebook",
      name: "MacBook Air 15 M3, 16GB",
    },
  },
];

const cartList = [];

for (entri of carts) {
  cartList.push(`${entri.product.name} ${entri.quantity}개`);
}

console.log(cartList.join(", "));
