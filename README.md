# Sobre o Projeto

O objetivo principal da Philips Dev Week é desenvolver, durante 4 dias, um sitema de Consulta para Tratamento de Câncer de Mama do SUS.

### Desafio: 
- Desenvolver, junto com experts, uma API Restfull com Java e Springboot, acessando os dados de Câncer de Mama (base de dados - DATASUS).

> Diferenciais:
- Aplicação de boas práticas de desenvolvimentos para praticar alguns conceitos aprendidos durante a minha leitura do livro
[Clean Architecture](https://www.amazon.com.br/Clean-Architecture-Craftsmans-Software-Structure/dp/0134494164/ref=asc_df_0134494164/?tag=googleshopp00-20&linkCode=df0&hvadid=379726160779&hvpos=&hvnetw=g&hvrand=17151302276102489714&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1031436&hvtargid=pla-423658477418&psc=1) e [Clean Code](https://www.amazon.com.br/Clean-Code-Handbook-Software-Craftsmanship/dp/0132350882/ref=pd_bxgy_1/138-1622077-3996926?pd_rd_w=3D4yu&pf_rd_p=f6d6e5b8-8da7-4a7b-8303-08e67f79afcf&pf_rd_r=D7AGXZDFJ3QQ3GSYRY2V&pd_rd_r=57ac1f9b-652b-443d-83b6-6d1670c925c2&pd_rd_wg=azTcK&pd_rd_i=0132350882&psc=1);
- Utilização do banco de dado MongoDB para fortalecer meus conhecimentos sobre banco de dados NoSQL;
- Utilização da biblioteca __lombok__ para melhorar a legibilidade do código;
- Pequenas melhorias durante a refatoração de código;
- Utilização dos Spring Validation para melhorar a consistência dos dados;
- Implentação de logs para registrar as execuções de operações importantes;
- Auditoria básica para manter melhor controle sobre a criação de entidades (Obs: como não há mecânismos de autencicação/autorização neste projeto, a auditoria resumiu-se apenas em controlar data e hora de criação e atualização das entidades do sistema).

### Tarefas
- [X] Organização da arquiterura
- [X] Configuração do Banco de Dados
- [X] Criação do modelo de domímio
- [ ] Deploy com o Git Actions (Deploy Continuous Integration)


### Features

- [X] Criar uma nova faixa etária
- [ ] Remover uma faixa etária
- [ ] Buscar uma faixa etária pelo id
- [ ] Buscar as faixas etárias por filtro
- [ ] Criar uma nova região
- [ ] Remover uma região
- [ ] Buscar uma região pelo id
- [ ] Buscar as regiões por filtro
- [ ] Criar uma nova incidencia de exame
- [ ] Remover uma incidencia de exame
- [ ] Buscar uma incidencia de exame pelo id
- [ ] Buscar todas as incidencias de exame


### 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

- [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/)
- [Java Amazon Corretto 17](https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/downloads-list.html)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Mongo DB](https://www.mongodb.com/)