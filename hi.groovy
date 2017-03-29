@RestController
class GreetingsRestController {

  @RequestMapping("/")
  def hi(){
    [ greeting : "Hi!" ]
  }

  @RequestMapping("/hi/{name}")
  def hi(@PathVariable String name){
    [ greeting : "Hello, "+name+"!" ]
  }

}
