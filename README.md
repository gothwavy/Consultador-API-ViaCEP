# 📦 Consulta de CEP com API ViaCEP (Java)

Projeto desenvolvido por [Ryan](https://github.com/gothwavy) para realizar consultas de CEPs brasileiros utilizando a API pública do [ViaCEP](https://viacep.com.br/), com foco em boas práticas de programação Java. O programa busca dados de endereço com base no CEP informado, trata erros de forma robusta e salva os resultados em arquivos `.json`.

---

## 🚀 Tecnologias e recursos utilizados

- ✅ **Java 17+**
- 📦 **Records** – para modelar os dados da API
- 🧱 **POO (Classes e Objetos)** – para organização e reutilização de código
- 🌐 **Java HTTP Client (HttpClient)** – para comunicação com a API ViaCEP
- ❗ **Tratamento de Exceções** – para garantir robustez e legibilidade
- 📝 **Criação de Arquivos JSON** – persistência de dados localmente

---

## 📌 Funcionalidades

- 🔍 Consulta de CEP via linha de comando
- 🧾 Validação de entrada (8 dígitos numéricos)
- 💾 Geração de arquivo `localX.json` com os dados retornados
- ❌ Mensagens claras para erros como CEP inexistente

---

## 🧪 Exemplo de uso

```bash
Digite um CEP: 01001000

Resultado:
{
  "Cep": "01001-000",
  "Logradouro": "Praça da Sé",
  "Localidade": "São Paulo",
  "Bairro": "Sé",
  "Uf": "SP",
  "Estado": "São Paulo"
}

Arquivo "localX.json" gerado com sucesso!
