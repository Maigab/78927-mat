using System;
using WSDL.mensajes;

namespace WSDL.operaciones{
    public class Operaciones : Mensajes{
        
        List<string> saludo = new List<string>();
        
        public string Saludar(string nombre){
            string msj = nombre;
            saludo.Add(nombre);
            return msj;
        }
        public string Mostrar(int id){
            return saludo[id-1];
        }
    }
}
