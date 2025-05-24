# Avaliação L2 - API de Empacotamento de Pedidos

Projeto desenvolvido com Maven e Java 21.

## Como executar

No diretório raiz do projeto (onde está o `pom.xml`):

```bash
& "C:\Program Files\Java\apache-maven-3.9.6\bin\mvn.cmd" spring-boot:run -f "caminho-pasta-download\avaliacao_l2_atvd_2\pom.xml"
```

No navegador local do seu computador:

```bash
localhost:8080/api/horarios
```

#### Exemplo de saida
Saída:
{
  "HorasTrabalhadasPorProfessor" : [ {
    "total_hours" : 1.50,
    "professorid" : 2
  }, {
    "professorid" : 1,
    "total_hours" : 3.00
  } ],
  "SalasOcupadas" : [ {
    "status" : "OCUPADA",
    "end_time" : "09:30:00",
    "start_time" : "08:00:00",
    "day_of_week" : 1,
    "roomid" : 1
  }, {
    "end_time" : "15:30:00",
    "start_time" : "14:00:00",
    "status" : "OCUPADA",
    "day_of_week" : 5,
    "roomid" : 1
  }, {
    "end_time" : "11:30:00",
    "status" : "OCUPADA",
    "start_time" : "10:00:00",
    "roomid" : 2,
    "day_of_week" : 3
  } ]
}