# Desafio iPhone — DIO

Modelo em Java dos três papéis apresentados no desafio: reprodutor musical,
aparelho telefônico e navegador na internet. `IPhone` implementa as três
interfaces, e o diagrama UML está em [`diagrama-iphone.puml`](diagrama-iphone.puml)
(formato PlantUML).

## Estrutura

- `ReprodutorMusical`: selecionar, tocar e pausar música.
- `AparelhoTelefonico`: ligar, atender e iniciar correio de voz.
- `NavegadorInternet`: exibir página, abrir aba e atualizar página.
- `IPhone`: implementação conjunta dos três papéis.

## Compilar

Com JDK instalado, na raiz do repositório:

```sh
mkdir -p out
javac -d out src/main/java/br/com/dio/iphone/*.java
```

O diagrama pode ser renderizado com PlantUML.
