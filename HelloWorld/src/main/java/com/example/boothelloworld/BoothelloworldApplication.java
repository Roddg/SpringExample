package com.example.boothelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BoothelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoothelloworldApplication.class, args);
	}

    /*Добавленный нами метод hello () предназначен для приема строкового параметра с именем name и последующего
    объединения этого параметра со словом «Hello» в коде. Это означает, что если вы укажете в запросе свое имя «Эми»,
    ответ будет «Привет, Эми». Аннотация @RestController сообщает Spring, что этот код описывает конечную точку,
    которая должна быть доступна через Интернет. @GetMapping («/ hello») сообщает Spring использовать наш метод hello ()
    для ответа на запросы, которые отправляются на адрес http: // localhost: 8080 / hello. Наконец,
    @RequestParam сообщает Spring ожидать значение имени в запросе, но если его нет,
    по умолчанию будет использоваться слово «World».
     */
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

}


