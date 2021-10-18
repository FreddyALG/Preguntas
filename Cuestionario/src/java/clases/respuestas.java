
package clases;

import java.util.StringTokenizer;


public class respuestas {
    
    String[] respuestas = {
        "El Amazonas", "China", "El Burj Khalifa", "Rumanía", "La Ciudad del Vaticano",
        "Titanic - Ben Hur - el Señor de los anillos: el retorno del rey", "1989",
        "De 1914 a 1918", "De 1939 a 1945", "El 4 de julio", "En el año 1991", "Oda a la Alegría",
        "En 1917", "El océano Pacífico", "Chichén Itzá - Coliseo de Roma - El Cristo Redentor - La Gran Muralla China - Petra - Taj Mahal y Machu Picchu",
        "La Gran Pirámide de Giza - Estatua de Zeus - Coloso de Rodas - Templo de Artemisa - Faro de Alejandría - el Mausoleo de Halicarnaso y los Jardines Colgantes de Babilonia",
        "El 12 de octubre de 1492", "Siete lados", "Michael Phelps", "El mosquito", "La civilización sumeria",
        "Júpiter", "Homo sapiens sapiens", "El judaismo", "La ballena azul"
    };
    
    String[] opciones = {
        "Nilo, El Amazonas, Mississippi, Yeniséi",
        "India, Estados Unidos, Indonesia, China",
        "Shanghai Tower, El Burj Khalifa, Central Park Tower, International Commerce Centre",
        "Hungria, Rumanía, Bulgaria, Eslovaquia",
        "Mónaco, Islas Marshall, La Ciudad del Vaticano, Tuvalo",
        "Lo que el viento se llevo - West Side Story - El paciente inglés, Gigi - El último emperador - De aquí a la eternidad, Titanic - Ben Hur - el Señor de los anillos: el retorno del rey, Avenger Infinty War - Avatar - el Señor de los anillos: el retorno del rey",
        "1987, 1989, 1984, 1988",
        "De 1912 a 1920, De 1914 a 1918, De 1986 a 1989, De 1950 a 1965",
        "De 1910 a 1915, De 1909 a 1925, De 1939 a 1945, De 1989 a 1995",
        "El 4 de junio, El 7 de agosto, El 4 de julio, El 4 de septiembre",
        "En el año 1986, En el año 1991, En el año 1987, En el año 1935",
        "Nkosi Sikelili, La Marsellesa, Oda a la Alegría, Land of my fathers",
        "En 1917, En 1916, En 1986, En 1976",
        "El océano Atlántico, El océano Ártico, El océano Pacífico, El océano Antártico",
        "Chichén Itzá - Coliseo de Roma - El Cristo Redentor - La Gran Muralla China - Petra - Taj Mahal y Machu Picchu, Angkor Wat - Estatua de la Libertad - Templo de la Sagrada Familia - Iglesia de Santa Sofía - Ópera de Sídney - Palacio de Potala - Golden Gate, Moais de la Isla de Pascua - Mezquita de Djingareyber - Templo de Meenakshi Amman - Palacio Imperial de Tokio - Empire State - Catedral de Aquisgrán - Templo de Oro, Acrópolis de Atenas - Templo de Brihadeshwara - Templo de Arunachaleswara - Estatua Bahubali - Santiago de Compostela - Parlamento de Budapest - Stonehenge",
        "Estatua Bahubali - Santiago de Compostela - Parlamento de Budapest - Stonehenge - Kremlin - Torre de Pisa - Palacio de Versalles - Torre Eiffel - Ciudad histórica de Sanaa - La Giralda - Alhambra, Angkor Wat - Estatua de la Libertad - Templo de la Sagrada Familia - Iglesia de Santa Sofía - Ópera de Sídney - Palacio de Potala - Golden Gate, Moais de la Isla de Pascua - Mezquita de Djingareyber - Templo de Meenakshi Amman - Palacio Imperial de Tokio - Empire State - Catedral de Aquisgrán - Templo de Oro, La Gran Pirámide de Giza - Estatua de Zeus - Coloso de Rodas - Templo de Artemisa - Faro de Alejandría - el Mausoleo de Halicarnaso y los Jardines Colgantes de Babilonia",
        "El 15 de octubre de 1492, El 12 de octubre de 1492, El 31 de octubre de 1492, El 19 de octubre de 1492",
        "Seis lados, Siete lados, Ocho lados, Nueve lados",
        "Michael Phelps, Paavo Nurmi, Mark Spitz, Carl Lewis",
        "Tiburón, Lobos, Leones, El mosquito",
        "La civilización sumeria, El Imperio Aqueménida, El Antiguo Egipto, La Antigua Mesopotamia",
        "Mercurio, Júpiter, Saturno, Urano",
        "Homínidos, Homo sapiens sapiens, Mamíferos, Humanos",
        "Hinduismo, El judaismo, Cristianismo, Budismo",
        "La orca, La anaconda, La ballena azul, El calamar gigante"
    };
    
    public String getRespuesta(int posicion){
        return respuestas[posicion];
    }
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena, separador);
        
        String[] a = new String[4];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken();
            i++;
        }
        
        return a;
    }
    
    public String[] setRespuestas(int posicion){
        String f1 = opciones[posicion];
        String[] f2 = separar(f1, ",");
        return f2;
    }
    
}
