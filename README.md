# Projeto API - TrackCash
Repositório destinado ao projeto de API 2° SEM
 
Projeto de API - 2° Semestre de 2022 da Fatec São José dos Campos - TRACKCASH


<br>
<table>
  <tr>
    <td>Cliente</td>
    <td>Periodo/Curso</td>
    <td>Professor M2</td>
    <td>Professor P2</td>
    <td> Contato Cliente </td>
  </tr>
  <tr>
    <td> Regis Santos </td>
    <td>  2º ADS (Análise e Desenvolvimento de Sistemas) </td>
    <td> Cláudio Etelvino de Lima</td>
    <td> Giuliano Araujo Bertoti </td>
    <td> regis.santos@trackcash.com.br </td>
  </tr>
</table>
</br>

# Artigos

- <a href ="#conhecimento-exigido"> Conhecimento Exigido </a>
- <a href ="#equipes"> Equipes </a>
- <a href ="#projeto"> Projeto </a>
- <a href ="#objetivo"> Objetivo </a>
- <a href ="#requisito-do-site"> Requisitos do Site </a>
- <a href ="#metodologia"> Metodologia </a>
- <a href ="#cronograma-e-sprint"> Cronograma e Sprints </a>
- <a href ="#tecnologia-utilizadas"> Tecnologias Utilizadas </a>
- <a href ="#design-thinking"> Design Thinking </a>
- <a href ="#bsc---balanced-scorecard"> BSC - balanced Scorecard </a>
- <a href ="#backlog-do-produto"> Backlog do Produto </a>
- <a href ="#burndown-do-projeto"> Burndown do Projeto </a>

# Conhecimento exigido 

> Documentação de Software (Briefing, Wireframes)
- Levantamento de requisitos 
- Implementar Aplicação usando Linguagem de Programação Java Desktop
- Planejar e implementar Modelo de dados Relacional
- Utilizar banco de dados MySQL

# Equipes
<table>
  <tr>
    <td>Integrantes</td>
    <td>Funções</td>
    <td>Linkedin</td>
    <td>Github</td>
    <td>Teste DISC </td>
  </tr>
  <tr>
    <td>Italo Nascimento</td>
    <td>PO</td>
    <td><a href=""><img src="https://cdn-icons-png.flaticon.com/512/174/174857.png" width="30px"></a></td>
    <td><a href="https://github.com/italobonilha"><img src="https://cdn-icons-png.flaticon.com/512/25/25231.png" width="30px"></a></td>
    <td>Influência</td>
  </tr>
  
  <tr>
    <td>Marina Angela</td>
    <td>SM</td>
    <td><a href="https://br.linkedin.com/in/marinaangela"><img src="https://cdn-icons-png.flaticon.com/512/174/174857.png" width="30px"></td>
    <td><a href=""><img src="https://cdn-icons-png.flaticon.com/512/25/25231.png" width="30px"></a></td>
    <td>Dominante</td>
  </tr>
  
  <tr>
    <td>Ali Mohamed</td>
    <td>ST</td>
    <td><a href="https://www.linkedin.com/in/alimohamedkhodr"><img src="https://cdn-icons-png.flaticon.com/512/174/174857.png" width="30px"></a></td>
    <td><a href="https://github.com/alimoahmed"><img src="https://cdn-icons-png.flaticon.com/512/25/25231.png" width="30px"></a></td>
    <td>Estável</td>
  </tr>
  
  <tr>
    <td>Debora Taira</td>
    <td>ST</td>
    <td><a href=""><img src="https://cdn-icons-png.flaticon.com/512/174/174857.png" width="30px"></a></td>
    <td><a href="https://github.com/deborataira"><img src="https://cdn-icons-png.flaticon.com/512/25/25231.png" width="30px"></a></td>
    <td>Dominante</td>
  </tr>
  
  <tr>
    <td>Pedro Seraggi</td>
    <td>ST</td>
    <td><a href="https://www.linkedin.com/in/pedro-seraggi-5b7491163/"><img src="https://cdn-icons-png.flaticon.com/512/174/174857.png" width="30px"></a></td>
    <td><a href="https://github.com/PedroSeraggi"><img src="https://cdn-icons-png.flaticon.com/512/25/25231.png" width="30px"></a></td>
    <td>Estável</td>
  </tr>
  
  <tr>
    <td>João Pedro</td>
    <td>ST</td>
    <td><a href=""><img src="https://cdn-icons-png.flaticon.com/512/174/174857.png" width="30px"></td>
    <td><a href="https://github.com/joaolrez"><img src="https://cdn-icons-png.flaticon.com/512/25/25231.png" width="30px"></a></td>
    <td>Estável</td>
  </tr>
  
  <tr>
    <td>Rita Hecht</td>
    <td>ST</td>
     <td><a href=""><img src="https://cdn-icons-png.flaticon.com/512/174/174857.png" width="30px"></a></td>
    <td><a href="https://github.com/ritahecht"><img src="https://cdn-icons-png.flaticon.com/512/25/25231.png" width="30px"></a></td>
    <td>Estável</td>
  </tr>
  
   <tr>
    <td>Isabela Silva</td>
    <td>ST</td>
    <td><a href=""><img src="https://cdn-icons-png.flaticon.com/512/174/174857.png" width="30px"></a></td>
    <td><a href="https://github.com/isabelasousa"><img src="https://cdn-icons-png.flaticon.com/512/25/25231.png" width="30px"></a></td>
    <td>Cautela</td>
  </tr>
  
 
  
</table>

```
PO - Product Owner
SM - Scrum Master
ST - Scrum Team
```

# Projeto
Desenvolver um CRUD para que a empresa TrackCash possa atender a demanda dos seus clientes que são vendedores de lojas onlines e fisicas, para que assim possam realizar o processo de conciliação finaceira. Criaremos uma aplicação onde os clientes deem autorização por meio de email/senha ou tokens para que os sistemas da TrackCash possam ter acesso a determinadas configurações como: apis e planilhas automatizadas, assim o sistema salvará as informações de usuários/senhas e tokens.
 


 
# Objetivo

Apresentar todos os requisitos estabelecidos pelo cliente, atingindo um nível satisfatório do produto para empresa e cliente.
 


# Requisito da Aplicação

> Requisitos Funcionais:
- Cadastro de canais (Marketiplace e Meios de Pagamentos)
- Configurações de canais (Aqui é onde o cliente realiza a configuração)
- Configurações Ativas (Utilizada para editar ou remover uma configuração)

> Requisitos não Funcionais:
- Linguagem Java (requisito Fatec)
- Banco de Dados Relacional (requisito Fatec)
- Documentações



# Metodologia

- 
# Cronograma e Sprint

- [Cronograma](https://github.com/TechForce-ADS/Projeto_API_TrackCash/blob/main/imagens/cronograma.png)

> Sprint:

 <img src = "https://github.com/TechForce-ADS/Projeto_API_TrackCash/blob/main/imagens/Cronograma%20das%20sprints_atualizado.png" alt="sprint" >
 
 ### <p>:x: <a href="https://github.com/ ">Sprint 1</a> - 15/08 - 18/09</p>
 > <p>:x: Página de Vagas</p>
 > <p>:x: Informações das Vagas</p>
 > <p>:x: Campo de Busca (sem funcionalidade)</p>
 > <p>:x: Cabeçalho e Rodapé</p>
 > <p>:x: Design Thinking</p>
 
 ### <p>:white_check_mark:<a href="https://github.com/ ">Sprint 2</a> - 19/09 - 09/10</p>
 > <p>:white_check_mark: Página Home, Métricas, Cursos e Certificações</p>
 > <p>:white_check_mark: Início da interação com as Linguagens de Programação</p>
 > <p>:white_check_mark: Carrossel de Vagas</p>
 > <p>:white_check_mark: BSC - Balanced Scorecard </p>
 

 ### <p>:white_check_mark: <a href="https://github.com/ ">Sprint 3</a> - 13/10 - 06/11</p>
 > <p>:white_check_mark: Framework e Bootstrap</p>
 > <p>:white_check_mark: Localização e Busca </p>
 > <p>:white_check_mark: Banco de Dados </p>
 > <p>:white_check_mark: Carrossel de Cursos </p>
 > <p>:white_check_mark: ITIL  </p>
 > <p>:white_check_mark: Documentação do Projeto</p>
 > <p>:white_check_mark: Apresentação em PowerPoint</p>
 > <p>:white_check_mark: GitHub</p>

  ### <p>:white_check_mark: <a href="https://github.com/ ">Sprint 4</a> - 07/11 - 27/11</p>
 > <p>:white_check_mark: Framework e Bootstrap</p>
 > <p>:white_check_mark: Localização e Busca </p>
 > <p>:white_check_mark: Banco de Dados </p>
 > <p>:white_check_mark: Carrossel de Cursos </p>
 > <p>:white_check_mark: ITIL  </p>
 > <p>:white_check_mark: Documentação do Projeto</p>
 > <p>:white_check_mark: Apresentação em PowerPoint</p>
 > <p>:white_check_mark: GitHub</p>


# Tecnologia Utilizadas

<img src ="https://github.com/DISPVAG/imagens/blob/main/tecnologia3.png"/>

## 


> - JAVA Desktop
> - MySQL
> - Canvas
> - Pacote Office
> - GitHub
> - Discord



# Design Thinking

O Design Thinking significa pensar como um designer ou, por assim dizer, “pensar fora da caixa”. Trata-se de uma abordagem criativa utilizada para a resolução de problemas.

- EMPATIA
A primeira etapa dessa abordagem é considerada a fase de entendimento e compreensão de todos os elementos de um problema. Isso envolve o problema em si, o público, as outras soluções já disponíveis e a sua empresa.
Esse processo de conhecimento é realizado por meio do mergulho no tema, identificando várias perspectivas presentes e situações particulares que fazem parte do universo do problema a ser resolvido.
- DEFINIR
Depois de entender todos os detalhes sobre o problema, o tema em geral, o público e as possibilidades disponíveis, são o momento de analisar os dados coletados e elaborar uma síntese para guiar o processo de criação da solução.
Dessa forma, é na etapa de análise e síntese que acontece o planejamento das ações que precisam ser realizadas para que, ao final do projeto, a abordagem de Design Thinking tenha um resultado eficiente.
É fundamental que cada detalhe dessa etapa esteja documentado e apresentado de uma forma visual, para que sirva de base para todo o restante do projeto.
- IDEALIZAÇÃO
A etapa de idealização deve servir para que todos envolvidos no projeto possam sugerir propostas de intervenção e apresentar seus insights. Um resultado eficiente, normalmente, é encontrado em projetos que conseguem desenvolver ideias de representantes de várias perspectivas sobre o problema.
- PROTOTIPAGEM
A criação de protótipos funciona como uma forma de testar a aderência da solução junto ao público e o resultado para a empresa.
- TESTES
Após o momento de prototipagem, você terá dados sobre a performance da sua solução e informações sobre os ajustes necessários. Depois de realizar as alterações necessárias, é hora de implementar o que foi planejado e colocar no mercado.
#

> :white_check_mark:<a href="https://github.com/DISPVAG/DISPVAG/blob/main/Design%20Thinking/README.md#1%C2%BA-sprint">**1º Sprint**</a>

> :white_check_mark: <a href="https://github.com/DISPVAG/DISPVAG/blob/main/Design%20Thinking/README.md#2%C2%BA-sprint">**2º Sprint**</a>


# BSC - Balanced Scorecard 

A ideia central do BSC é enxergar de forma balanceada, todas as métricas de negócio de uma empresa, agrupadas em objetivos estratégicos e que tenham uma relação de causa e efeito entre elas.

> Perspectivas:
As quatro perspectivas originais do BSC são:
- Financeira
- Clientes
- Processos Internos
- Aprendizado e Crescimento

> Objetivo Estratégico:
Os Objetivos Estratégicos definem o rumo que a empresa deve seguir e mostram a resposta esperada para uma pergunta depois de um determinado período. Por exemplo: como nossa situação financeira estará no fim do ano? Ou como estará nossa relação com o mercado?
- Analise SWOT

> Indicadores chaves de desempenho
são informações manipuladas matematicamente, de forma a auxiliar na tomada de decisão e com maior qualidade do que as informações ou dados.
- Dashboard 

> Metas
Uma boa prática para a definição de metas é a utilização da metodologia SMART.
- "Obter R$X MM de faturamento até o fim de 2016"

> Mapas Estratégicos
Os mapas estratégicos são a representação gráfica do BSC que torna ainda mais simples para sua empresa realizar seu processo de planejamento e acompanhamento.

#
> <a href="https://github.com/DISPVAG/DISPVAG/blob/main/BSC/README.md">**Nosso BSC**</a>


# Backlog do Produto 
<img src = "https://github.com/ " />

# Burndown do Projeto
> 1° Sprint:
<img src = "https://github.com/ " />

> 2° Sprint:
<img src = "https://github.com/ " />

> 3° Sprint:
<img src = "https://github.com/ " />

> 4° Sprint:
<img src = "https://github.com/ " />


