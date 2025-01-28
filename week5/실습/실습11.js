var object = {
  name: "Aaron",
  age: 10,
  address: {
    location: "Earth",
  },
  cars: ["Ford", "Porche"],
};

function copy_object(object) {
  const copied = JSON.parse(JSON.stringify(object)); // 그냥 간단하게 이렇게 하면 되는데 왜 향상된 for구문과 typeof를 써야할까?
  return copied;
}

var copied = copy_object(object);

copied.name = "Baron";
copied.address.location = "Moon";
copied.cars.push("Aston Martin");
object === copied;
console.log(object);
console.log(copied);
