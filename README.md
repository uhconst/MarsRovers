# Mars Rovers

Sistema para calcular a coordenada de um Rover em marte após a entrada de sua localização inicial e seus movimentos.

## Detalhes de Desenvolvimento

1) Desenvolvimento utilizando Spring MVC. Também apliquei um pouco de front-end, com Bootstrap, JQuey e Thymeleaf.

2) Usei um plugin do JQuery para máscara dos dois primeiros inputs. Aceitando apenas 2 números e 2 números + 1 letra(N ou E ou S ou W), respectivamente. No terceiro input, dos movimentos, não usei máscara. Deixando aberto ao usuário o comando que quiser (mas no Java eu só aceito os comandos esperados).

3) A máscara dos dois primeiros inputs da o espaço automáticamente entre as coordenadas. Considerei, já que não foi especificado, que as coordenadas só poderiam ser de 1 dígito. Sendo uma regra de negócio própria, podendo ser alterada facilmente dependendo da necessidade.

4) Na classe RoverService (Regras de negócio) eu só considero como movimento se for entrado a letra M/m ou L/l ou R/r. Demais letras são desconsideradas, soltando apenas um System.out, apenas para controle. Mesmo havendo máscara para o input das coordenadas de deploy do rover, apenas são considerados os pontos cardeais esperados como entrada. O mesmo ocorre para o upper-right do plateau.

5) Estou dando um System.out para caso o rover saia fora da área do plateau. Como não era um dos requisitos, não estou retornando nenhuma mensagem na tela. Apenas um controle interno mesmo.

6) Usando JUnit para o teste *(RoverServiceTest.java)*. Setando valores fictícios ao Rover e análisando se as saídas são os valores esperados.


## Iniciando

Foi feito o deploy do sistema no Heroku, para poder facilitar sua execução e análise.

```
https://marsroversuhc.herokuapp.com/
```

### Executando localmente
Também é possível baixar o projeto e executa-lo localmente com Spring Boot.

```
  git clone https://github.com/uhconst/MarsRovers.git
	cd MarsRovers
	./mvnw spring-boot:run
```

## Trabalhando com MarsRovers no Eclipse/STS

### Pré-requisitos
Os seguintes itens devem ser instalados no seu sistema:
* Maven 3 (http://www.sonatype.com/books/mvnref-book/reference/installation.html)
* git command line tool (https://help.github.com/articles/set-up-git)
* Eclipse with the m2e plugin (m2e is installed by default when using the STS (http://www.springsource.org/sts) distribution of Eclipse)


### Passos:

1) Na linha de comando
```
git clone https://github.com/uhconst/MarsRovers.git
```
2) No Eclipse/STS
```
File -> Import -> Maven -> Existing Maven project
```

## Rodando os testes
Os testes foram desenvolvidos usando JUnit.

Estão localizados dentro de MarsRovers/src/test/java no pacote com.uhc.service.RoverServiceTest.java.

O teste verifica se o calculo da coordenada final do Rover (X, Y e H) estão corretos, com base em um input de teste.

### Teste do cálculo de coordenada

Testa as coordenadas e direção do rover

```
testX = 1;
testY = 3;
testH = "N";
```

### Confere se a saida é o esperado

Após o calculo, confere a saida desejada com a calculada

## Desenvolvido com

* [STS](https://spring.io/tools/sts) - IDE baseada em Eclipse para aplicações Spring
* [Spring Boot](https://projects.spring.io/spring-boot/) - Criação de projeto Spring MVC
* [Maven](https://maven.apache.org/) - Dependency Management

## Autor

* **Uryel Constancio** - [MarsRovers](https://github.com/uhconst/MarsRovers)
