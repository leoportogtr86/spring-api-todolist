101 exercícios gradativos em Spring Boot com PostgreSQL. Ao final, a implementação levará
à criação de uma API completa de cadastro de tarefas.

### Configuração Inicial

1. **Instalação do Spring Boot CLI**: Instale o Spring Boot CLI e crie um projeto Spring Boot. - OK
2. **Configuração do Projeto**: Configure o projeto com as dependências necessárias para Spring Boot e PostgreSQL
   no `pom.xml`. - OK

### Configuração do Banco de Dados

3. **Instalação do PostgreSQL**: Instale e configure o PostgreSQL no seu ambiente. - OK
4. **Configuração do Banco de Dados no application.properties**: Configure as propriedades de conexão com o banco de
   dados PostgreSQL. - OK
5. **Criação do Banco de Dados**: Crie o banco de dados para a aplicação. - OK

### Entidades JPA

6. **Criação da Entidade Tarefa**: Crie uma entidade JPA para representar a tarefa. - OK
7. **Mapeamento de Colunas**: Mapeie as colunas da entidade Tarefa com as colunas do banco de dados. - OK
8. **Adição de Anotações JPA**: Adicione anotações JPA para definir a chave primária e colunas obrigatórias. - OK

### Repositórios JPA

9. **Criação do Repositório Tarefa**: Crie um repositório JPA para a entidade Tarefa. - OK
10. **Método de Salvamento**: Implemente um método para salvar uma nova tarefa no repositório. - OK
11. **Método de Busca por ID**: Implemente um método para buscar uma tarefa pelo ID. - OK

### Serviços

12. **Criação do Serviço Tarefa**: Crie uma classe de serviço para encapsular a lógica de negócios da tarefa. - OK
13. **Método de Adição de Tarefa**: Implemente um método no serviço para adicionar uma nova tarefa. - OK
14. **Método de Busca de Tarefa por ID**: Implemente um método no serviço para buscar uma tarefa pelo ID. - OK
15. **Método de Atualização de Tarefa**: Implemente um método no serviço para atualizar uma tarefa existente. - OK
16. **Método de Exclusão de Tarefa**: Implemente um método no serviço para excluir uma tarefa pelo ID. - OK
17. **Método para Listar Todas as Tarefas**: Implemente um método no serviço para listar todas as tarefas. - OK

### Controladores REST

18. **Criação do Controlador Tarefa**: Crie um controlador REST para a entidade Tarefa.
19. **Endpoint de Criação de Tarefa**: Implemente um endpoint POST para criar uma nova tarefa.
20. **Endpoint de Busca de Tarefa por ID**: Implemente um endpoint GET para buscar uma tarefa pelo ID.
21. **Endpoint de Atualização de Tarefa**: Implemente um endpoint PUT para atualizar uma tarefa existente.
22. **Endpoint de Exclusão de Tarefa**: Implemente um endpoint DELETE para excluir uma tarefa pelo ID.
23. **Endpoint para Listar Todas as Tarefas**: Implemente um endpoint GET para listar todas as tarefas.

### Validações

24. **Adição de Validações na Entidade Tarefa**: Adicione validações utilizando anotações do Bean Validation.
25. **Tratamento de Exceções**: Implemente um handler global para tratar exceções e retornar mensagens de erro
    apropriadas.

### DTOs e Mapeamentos

26. **Criação de DTO para Tarefa**: Crie um DTO (Data Transfer Object) para a entidade Tarefa.
27. **Mapeamento de Entidade para DTO**: Implemente a lógica para mapear a entidade Tarefa para o DTO.
28. **Mapeamento de DTO para Entidade**: Implemente a lógica para mapear o DTO para a entidade Tarefa.

### Paginação e Ordenação

29. **Implementação de Paginação**: Adicione suporte à paginação na listagem de tarefas.
30. **Implementação de Ordenação**: Adicione suporte à ordenação na listagem de tarefas.

### Autenticação e Autorização

31. **Configuração de Segurança**: Configure a segurança básica da aplicação utilizando Spring Security.
32. **Criação de Usuário e Permissões**: Crie entidades para usuários e permissões.
33. **Autenticação com JWT**: Implemente autenticação utilizando tokens JWT.
34. **Autorização por Papel**: Adicione autorização baseada em papéis.

### Testes

35. **Testes Unitários para Serviço de Tarefa**: Implemente testes unitários para os métodos do serviço de Tarefa.
36. **Testes de Integração para Repositório de Tarefa**: Implemente testes de integração para o repositório de Tarefa.
37. **Testes de Integração para Controlador de Tarefa**: Implemente testes de integração para os endpoints do
    controlador de Tarefa.
38. **Testes de Segurança**: Implemente testes para verificar a segurança dos endpoints.

### Documentação

39. **Configuração do Swagger**: Adicione e configure Swagger para a documentação da API.
40. **Anotações Swagger nos Endpoints**: Adicione anotações Swagger nos endpoints para melhorar a documentação.

### Deploy

41. **Preparação para Deploy**: Configure a aplicação para deploy em diferentes ambientes.
42. **Deploy no Heroku**: Realize o deploy da aplicação no Heroku.
43. **Deploy no AWS**: Realize o deploy da aplicação na AWS.

### Exercícios Práticos

44. **Exercício 1**: Crie uma entidade "Projeto" e configure o relacionamento com "Tarefa".
45. **Exercício 2**: Adicione um campo "prioridade" à entidade Tarefa e crie um endpoint para buscar tarefas por
    prioridade.
46. **Exercício 3**: Crie um endpoint para buscar todas as tarefas de um determinado projeto.
47. **Exercício 4**: Adicione um campo "status" à entidade Tarefa e crie um endpoint para atualizar o status da tarefa.
48. **Exercício 5**: Implemente lógica para enviar notificações por e-mail quando uma tarefa é criada ou atualizada.
49. **Exercício 6**: Adicione suporte para upload de arquivos anexados a uma tarefa.
50. **Exercício 7**: Implemente um endpoint para buscar tarefas criadas nos últimos 7 dias.
51. **Exercício 8**: Adicione suporte para buscas complexas utilizando critérios múltiplos (ex: prioridade, status, data
    de criação).
52. **Exercício 9**: Crie um endpoint para clonar uma tarefa existente.
53. **Exercício 10**: Implemente lógica para calcular o tempo total gasto em uma tarefa (campo "tempo gasto").
54. **Exercício 11**: Crie um endpoint para exportar a lista de tarefas em formato CSV.
55. **Exercício 12**: Adicione suporte para filtrar tarefas por intervalo de datas.
56. **Exercício 13**: Implemente um dashboard para visualizar estatísticas de tarefas (ex: tarefas concluídas,
    pendentes, etc.).
57. **Exercício 14**: Adicione suporte para múltiplos idiomas na aplicação.
58. **Exercício 15**: Implemente um sistema de tags para as tarefas e crie um endpoint para buscar tarefas por tags.
59. **Exercício 16**: Adicione suporte para histórico de alterações nas tarefas.
60. **Exercício 17**: Implemente uma funcionalidade de busca global nas tarefas (ex: busca por título, descrição, etc.).
61. **Exercício 18**: Crie um endpoint para buscar tarefas atribuídas a um determinado usuário.
62. **Exercício 19**: Adicione suporte para anotações em tarefas (campo "anotações").
63. **Exercício 20**: Implemente lógica para enviar lembretes automáticos para tarefas próximas do prazo.
64. **Exercício 21**: Crie um endpoint para arquivar tarefas antigas.
65. **Exercício 22**: Adicione suporte para importar tarefas a partir de um arquivo CSV.
66. **Exercício 23**: Implemente uma funcionalidade para dividir uma tarefa em subtarefas.
67. **Exercício 24**: Adicione suporte para comentários em tarefas.
68. **Exercício 25**: Crie um endpoint para buscar tarefas por data de conclusão.
69. **Exercício 26**: Implemente lógica para gerar relatórios de produtividade com base nas tarefas concluídas.
70. **Exercício 27**: Adicione suporte para visualização de tarefas em um calendário.
71. **Exercício 28**: Implemente um sistema de classificação de tarefas (ex: urgente, importante, etc.).
72. **Exercício 29**: Crie um endpoint para buscar tarefas por palavra-chave.
73. **Exercício 30**: Adicione suporte para múltiplos arquivos anexados a uma tarefa.
74. **Exercício 31**: Implemente uma funcionalidade de chat em tempo real para discussões sobre tarefas.
75. **Exercício 32**: Adicione suporte para integração com ferramentas externas (ex: Trello, Slack).
76. **Exercício 33**: Crie um endpoint para buscar tarefas por intervalo de prioridade.
77. **Exercício 34**: Implemente lógica para

enviar relatórios semanais de tarefas por e-mail.

78. **Exercício 35**: Adicione suporte para filtros avançados na listagem de tarefas.
79. **Exercício 36**: Implemente uma funcionalidade para mesclar tarefas duplicadas.
80. **Exercício 37**: Crie um endpoint para buscar tarefas por autor.
81. **Exercício 38**: Adicione suporte para visualização de tarefas em um gráfico de Gantt.
82. **Exercício 39**: Implemente lógica para compartilhar tarefas com usuários externos.
83. **Exercício 40**: Crie um endpoint para buscar tarefas por categoria.
84. **Exercício 41**: Adicione suporte para notificações push quando uma tarefa é atualizada.
85. **Exercício 42**: Implemente uma funcionalidade para priorizar automaticamente tarefas com base em critérios
    definidos.
86. **Exercício 43**: Crie um endpoint para buscar tarefas com prazo próximo.
87. **Exercício 44**: Adicione suporte para salvar buscas personalizadas de tarefas.
88. **Exercício 45**: Implemente uma funcionalidade de sugestão de tarefas baseadas em histórico.
89. **Exercício 46**: Crie um endpoint para buscar tarefas por intervalo de tempo gasto.
90. **Exercício 47**: Adicione suporte para visualização de tarefas em um gráfico de burndown.
91. **Exercício 48**: Implemente lógica para recuperação de tarefas excluídas (lixeira).
92. **Exercício 49**: Crie um endpoint para buscar tarefas por número de comentários.
93. **Exercício 50**: Adicione suporte para envio de notificações SMS para atualizações de tarefas.
94. **Exercício 51**: Implemente uma funcionalidade para avaliar tarefas após conclusão.
95. **Exercício 52**: Crie um endpoint para buscar tarefas por intervalo de data de atualização.
96. **Exercício 53**: Adicione suporte para visualização de tarefas em um kanban board.
97. **Exercício 54**: Implemente lógica para enviar alertas de segurança para atividades suspeitas em tarefas.
98. **Exercício 55**: Crie um endpoint para buscar tarefas por tipo (ex: bug, feature, etc.).
99. **Exercício 56**: Adicione suporte para exportar tarefas em diferentes formatos (ex: JSON, XML).
100. **Exercício 57**: Implemente uma funcionalidade para definir metas de conclusão de tarefas.
101. **Exercício 58**: Crie um endpoint para buscar tarefas por status personalizado.

Essa lista deve fornecer uma progressão clara e gradual para aprender a construir uma API completa de cadastro de
tarefas em Java usando Spring Boot e PostgreSQL. Ao concluir todos os exercícios, você terá uma compreensão abrangente
de várias funcionalidades essenciais em uma aplicação real.