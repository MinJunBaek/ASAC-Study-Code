class View {
  print(string) {
    // console.log('두 수의 합은 ' + value + '입니다.')
    console.log("- 출력 > " + string);
  }
}

class Service {
  constructor(param1, param2) {
    this.param1 = param1;
    this.param2 = param2;
  }

  summation() {
    return new SummationDTO(this.param1, this.param2);
  }
}

class MultiplyDTO {}

// DDD : Domain Driven Development
class SummationDTO {
  #param1;
  #param2;
  #result;
  constructor(param1, param2) {
    this.#param1 = param1;
    this.#param2 = param2;
    this.#result = param1 + param2;
  }

  get result() {
    return this.#result;
  }

  toString() {
    console.log("두 수의 합은 " + this.#result + "입니다.");
  }
}

class Controller {
  constructor() {
    this.view = new View();
    this.service = new Service(1, 3);
  }

  start() {
    const result = this.service.summation();
    this.view.print(result.toString);
  }
}

const example = new Controller();
example.start();
