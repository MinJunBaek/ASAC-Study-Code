class View {
  print(value) {
    console.log("두 수의 합은 " + value + "입니다.");
  }
}

class Service {
  constructor(param1, param2) {
    this.param1 = param1;
    this.param2 = param2;
  }

  summation() {
    return this.param1 + this.param2;
  }
}

class Controller {
  constructor() {
    this.view = new View();
    this.service = new Service(1, 3);
  }

  start() {
    const result = this.service.summation();
    this.view.print(result);
  }
}

const example = new Controller();
example.start();
