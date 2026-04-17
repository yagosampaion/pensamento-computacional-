INÍCIO

    // Lista oficial de alunos
    listaOficial ← ["Lucas", "Mariana", "Pedro", "Ana", "João",
                    "Carla", "Bruno", "Fernanda", "Rafael", "Juliana",
                    "Gabriel", "Camila", "Felipe", "Larissa", "Diego",
                    "Patrícia", "Rodrigo", "Beatriz", "Thiago", "Amanda"]

    continuar ← "SIM"

    ENQUANTO continuar = "SIM" FAÇA

        ESCREVA "Digite o nome do aluno: "
        LEIA nomeAluno

        encontrado ← FALSO

        // Verificação na lista
        PARA i ← 0 ATÉ tamanho(listaOficial) - 1 FAÇA
            SE nomeAluno = listaOficial[i] (ignorando maiúsculas/minúsculas) ENTÃO
                encontrado ← VERDADEIRO
                PARE
            FIMSE
        FIMPARA

        // Condicional
        SE encontrado = VERDADEIRO ENTÃO
            ESCREVA "Entrada permitida. Bem-vindo!"
        SENÃO
            ESCREVA "Erro: Nome não encontrado. Entrada negada."
        FIMSE

        ESCREVA "Deseja verificar outro aluno? (SIM/NÃO): "
        LEIA continuar

    FIMENQUANTO

FIM
