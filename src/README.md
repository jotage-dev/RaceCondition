### Parte 3: User-Level vs. Kernel-Level Threads (Análise Teórica)

**Cenário:** Simulação de 1.000 threads, onde uma delas realiza uma operação bloqueante de I/O (leitura de arquivo no disco).

* **Com User-Level Threads (ULT - Mapeamento N:1):**
  O Sistema Operacional (Kernel) enxerga todas as threads como um **único processo**. Se uma thread fizer uma requisição de disco, o Kernel colocará o processo inteiro em estado de espera. Como consequência, as outras **999 threads ficarão totalmente paralisadas**, mesmo que tenham recursos disponíveis para continuar rodando. O paralelismo é perdido.

* **Com Kernel-Level Threads (KLT - Mapeamento 1:1):**
  O Kernel possui **Visibilidade Total**, mapeando e gerenciando cada thread individualmente (modelo padrão no Java e em SOs modernos). Se uma thread bloquear aguardando o disco, o escalonador do Sistema Operacional suspenderá **apenas ela**. As outras **999 threads continuarão executando normalmente** na CPU, mantendo a alta performance e a concorrência do sistema.