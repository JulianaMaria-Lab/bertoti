<h1 align="center"> Avaliação Heurística </h1>

<h2>:notebook_with_decorative_cover: Definições</h2>
As Diretrizes de Acessibilidade para Conteúdo Web (WCAG) abrangem diversas recomendações com a finalidade de tornar o conteúdo da Web mais acessível.
Para isso, há diversas orientações, incluindo princípios globais, diretrizes gerais, critérios de sucesso testáveis, um rico conjunto de técnicas de tipo necessárias ,e de tipo sugeridas ,bem como falhas comuns documentadas com exemplos, links para recursos e código fonte.

No topo estão quatro princípios que constituem a base da acessibilidade na Web: *perceptível*, *operável*, *compreensível* e *robusto*. 

Abaixo dos princípios estão as diretrizes, que fornecem os objetivos básicos que os autores devem atingir para tornar o conteúdo mais acessível. 

Para cada diretriz, são fornecidos critérios de sucesso testáveis para permitir que as WCAG sejam utilizadas onde os requisitos e os testes de conformidade são necessários.

A fim de atender as necessidades dos diferentes grupos e situações, são definidos três níveis de conformidade: A (o mais baixo), AA (moderado e o mais popular) e AAA (o mais elevado).

<hr>

<p align="center">
  • <a href ="#principio1"> 1.Perceptível </a>  • 
  <a href ="#principio2"> 2.Operável </a>  •
  <a href ="#principio3"> 3.Compreensível </a>  • 
  <a href ="#principio4"> 4.Robusto </a>  •  
</p>

<a name="principio1"></a>
<h2>:eyeglasses:Princípio 1 - Perceptível </h2>

As informações e os componentes da interface do usuário devem ser apresentados em formas que possam ser percebidas pelo usuário.

<h2>Diretriz 1.1 - Alternativas em Texto</h2>

Fornecer alternativas textuais para qualquer conteúdo não textual, para que possa ser transformado em outras formas de acordo com as necessidades dos usuários, tais como impressão com tamanho de fontes maiores, braille, fala, símbolos ou linguagem mais simples.

:white_check_mark:**Exemplo:**

<a href="https://www.americanas.com.br/"> Americanas</a> - alt descrevendo o conteúdo da imagem.

<img src = "https://user-images.githubusercontent.com/79669245/172492072-7165d8b6-a056-4bf4-b805-3d7fe3ef4fbf.png" width="800"/>
<img src = "https://user-images.githubusercontent.com/79669245/172485027-10b73ebf-6514-42a8-aab7-bbd4beb21cfc.png" width="800"/>


<h2>Diretriz 1.2 - Mídias com base em tempo</h2>

Fornecer alternativas para mídias baseadas em tempo.
##

<h3>Critério de Sucesso 1.2.5 Audiodescrição (Nível AA)</h3>

É fornecida audiodescrição para todo o conteúdo de vídeo pré-gravado existente em mídia sincronizada.
##
<h3>Critério de Sucesso 1.2.6 Língua de sinais (Nível AAA)</h3>

É fornecida interpretação em língua de sinais para todo o conteúdo de audio pré-gravado existente em um conteúdo em mídia sincronizada.
##

:white_check_mark:**Exemplo:**

<a href="https://br-store.acer.com/"> Acer </a> - Audiodescrição e interpretação da linguagem de sinais é fornecida. Conteúdo de áudio pré-gravado em mídia sincronizada.

<img src = "https://user-images.githubusercontent.com/79669245/172485026-a6901481-3f98-481b-98b5-6b40b4c8f063.gif" width="800"/>

<h2>Diretriz 1.3 - Adaptável</h2>

Criar conteúdo que pode ser apresentado de diferentes maneiras (por exemplo um layout simplificado) sem perder informação ou estrutura.

:white_check_mark:**Exemplo:**

<a href="https://www.instagram.com/"> Instagram </a> - Conteúdo no navegador (desktop) e na versão mobile.

<img src = "https://user-images.githubusercontent.com/79669245/172494390-2c13bb57-b646-4176-ade4-1a60820f4ea5.png" width="800"/>

:no_entry:**Contra Exemplo:**

<a href="https://www.consorcio123sistema.com.br/sbe-web/login/login.html"> Consórcio 123 </a> - Versão mobile - sem responsividade; a página e os campos ficam muito pequenos. 

<img src = "https://user-images.githubusercontent.com/79669245/172496469-22b40948-faab-4af3-8b4f-032ab64777b0.png" width="800"/>

<h2>Diretriz 1.4 - Discernível</h2>

Facilitar a audição e a visualização de conteúdo aos usuários, incluindo a separação entre o primeiro plano e o plano de fundo.

<h2>Critério de Sucesso 1.4.6 - Contraste (Nível AAA) </h2>

A apresentação visual do texto e imagens de texto tem uma relação de contraste de, no mínimo, 7:1, exceto para as seguintes situações:

•**Texto Ampliado**
<p>Texto em tamanho grande e as imagens compostas por texto em tamanho grande têm uma relação de contraste de, no mínimo, 4.5:1;</p>

•**Texto em plano Secundário**
<p>O texto ou as imagens de texto que fazem parte de um componente de interface de usuário inativo, que são meramente decorativos, que não estão visíveis para ninguém, ou que fazem parte de uma imagem que inclui outro conteúdo visual significativo, não têm requisito de contraste.</p>

•**Logotipos**
<p>O texto que faz parte de um logotipo ou marca comercial não tem requisito de contraste</p>

:white_check_mark:**Exemplo e :no_entry:Contra Exemplo:**

<a href="https://colortutorial.design/tutor.html"> Color Tutorial </a> - Demonstração do contraste de cores entre o plano de fundo e a fonte. Neste gif é mostrado o contraste de 21:1 até 1:1.

<img src = "https://user-images.githubusercontent.com/79669245/172505539-58e17f78-fbd4-4377-b7b8-4cc377bcd117.gif" width="800"/>
<hr>


<a name="principio2"></a>
<h2>🛠️Princípio 2 - Operável </h2>

Os componentes de interface de usuário e a navegação devem ser operáveis.

<h2>Diretriz 2.1 - Acessível por Teclado</h2>

Fazer com que toda funcionalidade fique disponível a partir de um teclado.
##

:white_check_mark:**Exemplo:**

<a href="https://promo.pepsi.com.br/cadastro.aspx"> Pepsi </a> - Formulário de cadastro de promoção com navegação através do teclado.

<img src = "https://user-images.githubusercontent.com/79669245/172506647-caa41b7b-8000-495d-8c46-d8257a31cc72.gif" width="800"/>

<h2>Diretriz 2.2 - Tempo Suficiente</h2>

Fornecer aos usuários tempo suficiente para ler e utilizar o conteúdo.
##

:white_check_mark:**Exemplo:**

<a href="https://www.eventbrite.com.br/"> Eventbrite </a> - A página possui um temporizador para realizar a compra.

<img src = "https://user-images.githubusercontent.com/79669245/172513559-3a565e4b-db24-4e79-8ae3-d2dfec9c5db4.png" width="800"/>


<a name="principio3"></a>
<h2>:thumbsup:Princípio 3 - Compreensível </h2>

A informação e a operação da interface de usuário devem ser compreensíveis.

<h2>Diretriz 3.1 Legível</h2>

Tornar o conteúdo do texto legível e compreensível.
##

:white_check_mark:**Exemplo:**

<a href="https://www.w3.org/WAI/WCAG21/quickref/"> Wcag </a> - Texto adequado para leitura e compreensão do usuário.

<img src = "https://user-images.githubusercontent.com/79669245/172515680-c194c76c-cb52-42be-861a-81c2828cf963.png" width="800"/>

<h2>Critério de Sucesso 3.1.1 - Idioma da Página (Nível A)</h2>

O idioma humano pré-definido de cada página web pode ser determinado por meio de código de programação.

:white_check_mark:**Exemplo:**

<a href="https://www.vagas.com.br/"> VAGAS </a> - Idioma da página definida no código HTML.

<img src = "https://user-images.githubusercontent.com/79669245/172516435-9901e57d-2f68-400a-8c1a-ddd52e27884f.jpg" width="800"/>

<h2>Diretriz 3.2 - Previsível</h2>

Fazer com que as páginas web apareçam e funcionem de modo previsível.

:white_check_mark:**Exemplo:**

<a href="https://www.gupy.io/"> Gupy </a> - Elementos do site bem definidos e com um padrão a se seguir.

<img src = "https://user-images.githubusercontent.com/79669245/172516987-7283a48b-08b0-460d-8786-18c9eec19439.png" width="800"/>

<h2>Diretriz 3.3 - Assistência de Entrada</h2>

Ajudar os usuários a evitar e corrigir erros.

:white_check_mark:**Exemplo:**

<a href="https://solides.jobs/"> Solides Jobs </a> - Indicação de que o dado não está correto.

<img src = "https://user-images.githubusercontent.com/79669245/172517615-fcc7679d-3c48-46c2-8a86-c2d6304dc3d2.png" width="800"/>
<hr>

<a name="principio4"></a>
<h2>:muscle:Princípio 4 - Robusto </h2>

O conteúdo deve ser robusto o suficiente para poder ser interpretado de forma confiável por uma ampla variedade de agentes de usuário, incluindo tecnologias assistivas.

<h2>Diretriz 4.1 - Compatível</h2>

Maximizar a compatibilidade entre os atuais e futuros agentes de usuário, incluindo tecnologias assistivas.

:white_check_mark:**Exemplo:**

<a href="https://www.w3schools.com"> w3 School </a> - CSS - Propriedade All e sua compatibilidade

<img src = "https://user-images.githubusercontent.com/79669245/172518749-2b4d3c92-0b7d-4087-83ec-b010868d7697.png" width="800"/>
<hr>

<h2> 📝 Referência - <a href="https://www.w3.org/WAI/WCAG21/quickref/">W3C - Conhecendo as WCAG - Diretrizes de Acessibilidade para Conteúdo Web </a><h2>
