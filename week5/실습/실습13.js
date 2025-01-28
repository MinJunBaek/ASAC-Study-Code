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

const products = detail_products.map((product) => {
  const categoryName = product.category.name;

  const firstOption = {
    name: product.option[0].name,
    additional_price: product.option[0].additional_price,
  };

  return {
    product_id: product.product_id,
    name: product.name,
    category: categoryName,
    option: firstOption,
    price: product.price,
  };
});

console.log(products);
