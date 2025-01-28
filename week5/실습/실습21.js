const detail_products = [
  {
    product_id: 1,
    name: "GeForce RTX 4090",
    category: {
      category_id: 23,
      name: "Graphic Card",
    },
    option: [
      {
        option_id: 12,
        name: "256GB",
        additional_price: 0,
      },
      {
        option_id: 13,
        name: "512GB",
        additional_price: 100000,
      },
    ],
    price: 400000,
  },
  {
    product_id: 2,
    name: "Nike Air Max 97",
    category: {
      category_id: 108,
      name: "Shoes",
    },
    option: [
      {
        option_id: 201,
        name: "Triple White",
        additional_price: 20000,
      },
      {
        option_id: 202,
        name: "Triple Black",
        additional_price: 40000,
      },
    ],
    price: 200000,
  },
  {
    product_id: 3,
    name: "MacBook Air 15 M3, 16GB",
    category: {
      category_id: 49,
      name: "Notebook",
    },
    option: [
      {
        option_id: 495,
        name: "16GB",
        additional_price: 0,
      },
      {
        option_id: 496,
        name: "32GB",
        additional_price: 320000,
      },
    ],
    price: 2200000,
  },
];

function productList(products) {
  const result = products.flatMap(
    ({ product_id, name, category: { name: categoryName }, option, price }) =>
      option.map(({ name: optionName, additional_price }) => ({
        product_id,
        name,
        category: categoryName,
        option: JSON.parse(
          JSON.stringify({ name: optionName, additional_price })
        ),
        totalPrice: price + additional_price,
        optype: typeof option,
      }))
  );
  return result;
}

const a = productList(detail_products);
console.log(a);
