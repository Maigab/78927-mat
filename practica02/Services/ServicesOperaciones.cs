using System;
using WSDL.mensajes;

namespace WSDL.operaciones{
    public class Operaciones : Mensajes{
        
        List<string> Saludo = new List<string>();
        
        public string Saludar(string nombre){
            string msj = nombre;
            Saludo.add(nombre);
            return msj;
        }
        public string Mostrar(int id){
            return Saludo[id-1];
        }
    }
}
