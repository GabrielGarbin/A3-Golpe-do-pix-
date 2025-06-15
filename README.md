# A3-Golpe-do-pix-
A3 de programação de software 
--= Golpe do pix =--

    Para executar o golpe, o golpista manda o pix para a vítima e entra
    em contato com ela para ela extornar o dinheiro recebido em outra conta,
    ao receber o dinheiro, o golpista entra na conta que mandou 
    o dinheiro e usa o Mecanismo Especial de Devolução (MED) para 
    recuperar o dinheiro e ter o dobro que tinha inicialmente.
    
                           ### Pré-requisitos ###

    Java Development Kit (JDK): É necessário ter o JDK (versão 8 ou superior) 
    instalado e configurado nas variáveis de ambiente do seu sistema (`JAVA_HOME` e `PATH`). 

    Você pode baixá-lo no site da   [Oracle] https://www.oracle.com 
    ou usar uma distribuição como o [OpenJDK](https://jdk.java.net/).

           -- NetBeans  ou  VS Code: --

    Para uma melhor experiência, utilize o [Visual Studio Code] 
    com o pacote de extensões [Extension Pack for Java]

    Passos para Execução via Terminal:

1.  Clone o repositório ou baixe os arquivos-fonte (`.java`) para uma pasta em seu computador.

2.  Abra um terminal (pode ser o CMD, PowerShell, ou o terminal integrado do VS Code) 
    e navegue até a pasta onde os arquivos do projeto foram salvos.

    EXEMPLO: cd caminho/para/a/pasta/do/projeto   

3.  Compile os arquivos ".java". Este comando criará os arquivos ".class" correspondentes,
    que são o código compilado que a Máquina Virtual Java (JVM) pode executar.

    Agora, vamos "traduzir" seu código-fonte (.java) 
    para um formato que o Java consegue executar. 
    Esse processo, chamado de compilação, é feito com o seguinte comando:

    EXEMPLO: "javac *.java"

4.  Execute o programa. Após a compilação, execute a 
    classe principal que contém o método "main".

    **Atenção:** 

    Substitua "NomeDaClassePrincipal" 
    pelo nome exato da classe que inicia o programa (sem a extensão ".java" ou ".class").

    EXEMPLO: "java NomeDaClassePrincipal"

    EXEMPLO: Se a classe principal se chama "SistemaAtendimento", o comando seria "java SistemaAtendimento"



    --- EXEMPLO Passo a Passo da Execução do Código: ---
    
    Seleção da Opção:

    O programa inicia apresentando um menu com quatro opções:

    Atendimento ao cliente, 
    Transferência não funcionando, 
    Denúncia de golpe
    Sair.

    O usuário digita 3 

    para selecionar a opção "Denúncia de golpe".

    Identificação das Partes:

    O sistema solicita o CPF do usuário (Digite seu CPF:). 

    O usuário insere 2.

    Em seguida, o sistema solicita o CPF do golpista (Digite o CPF do golpista:). 

    O usuário insere 1.

    Confirmação dos Dados:
    O programa acessa sua base de dados e confirma as identidades associadas aos CPFs informados:

    O CPF do usuário (2) corresponde a Maria Santos.
    O CPF do golpista (1) corresponde a Jorge Silva.

    Análise da Transação Original:
    O sistema localiza e exibe os Detalhes da transação que foi alvo do golpe:

    ID: 1
    Descrição: Pagamento de conta
    Valor: 150.75
    Tipo: Pix
    Data: 07-08-2025
    CPF do Pagador: 1 (Jorge Silva , o golpista)
    CPF do Recebedor: 2 (Maria Santos, a vítima)

    Esta etapa confirma a transação original que saiu da conta da vítima para a conta do golpista.

    Rastreamento do Dinheiro (Retorno da Transação):
    O sistema então exibe os Detalhes do retorno da transação.
    
                      O sistema pede para o usuário digitar o cpf que vai ser realizado o extorno, o sistema não aceita o cpf do usuário 
    
    No entanto, em vez de um simples estorno, ele mostra uma análise mais complexa do fluxo do dinheiro:
    Valor: 150.75 (o mesmo valor)
    Tipo: Pix
    Data: 07-08-2025
    CPF do Pagador: 2 (Maria Santos, a vítima)
    CPF do Recebedor: 3 (Alberto Rodrigues, o golpista ou o cúmplice)

    Esta informação é crucial: ela demonstra que o sistema rastreou o dinheiro e identificou 
    que a vítima (Maria Santos) transferiu o valor recebido 
    para uma terceira conta (CPF 3), caracterizando uma possível triangulação 
    de golpe para dificultar a recuperação dos fundos.

    Conclusão do Ciclo:
    Após exibir todas as informações relevantes sobre o golpe, o programa 
    retorna ao menu principal, ficando pronto para uma nova operação.

