class User {
  constructor(name, age) {
    this.name = name;
    this.age = age;
    this.favorites = [];
  }
  addFavorites(...rest) {
    rest.map((str) => this.favorites.push(str));
  }
}

const user = new User("Aaron", 10);
user.addFavorites("Book");
user.addFavorites("Cook", "Sports");
user.addFavorites("Drive", "Study", "Hiking");
console.log(user.favorites);
