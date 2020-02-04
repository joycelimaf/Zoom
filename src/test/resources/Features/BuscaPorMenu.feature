# language: pt
# Autor: Rayane Ferreira

@tag
Funcionalidade: Buscar pelo produto Geladeira pelo menu lateral
 

@buscaMenu
Esquema do Cenario: Pesquisar por Geladeira pelo menu
    Dado Abro a homepage Zoom
    E passar o mouseover no menu 
    E selecionar a "<Categoria>"
    Quando selecionar no submenu lateral o "<Produto>"
    Entao valido a busca do resultado exibido "<Item>"
    E Fecho navegador
 
  Exemplos:
 | Categoria        | Produto             | Item      |
 | Eletrodomesticos | Geladeira Brastemp  | Geladeira |

 
