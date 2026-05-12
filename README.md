# HackGov - Backend & Security Layer
**Projeto de Transformação Digital - FIAP**

## Arquitetura de Segurança
Este projeto implementa o padrão "Security by Design". 
- **Criptografia:** AES-256 para dados sensíveis dos cidadãos.
- **Autenticação:** OIDC via integração Gov.br.
- **Infraestrutura:** Dockerizada para isolamento de processos.

## Como rodar (Ambiente Linux[debian 13])
1. Instalar Docker e Docker-Compose.
2. Executar `docker-compose up -d`.
