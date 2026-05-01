package com.example.culture_generale.data

object QuestionRepository {
    val questions = listOf(
        Question(
            text = "Quelle est la capitale de l'Australie ?",
            options = listOf("Canberra", "Sydney", "Melbourne", "Brisbane"),
            correctIndex = 0,
            rating = 1150,
            explanation = "La capitale de l'Australie est Canberra, et non Sydney comme beaucoup le croient. Canberra a été construite de toutes pièces comme capitale fédérale, inaugurée en 1913, suite au compromis entre Sydney et Melbourne qui se disputaient ce titre. La ville a été conçue par les architectes américains Walter Burley Griffin et Marion Mahony Griffin, lauréats d'un concours international en 1912."
        ),
        Question(
            text = "Qui a peint la Joconde ?",
            options = listOf("Michel-Ange", "Léonard de Vinci", "Raphaël", "Botticelli"),
            correctIndex = 1,
            rating = 800,
            explanation = "La Joconde, ou Mona Lisa, est un tableau peint par Léonard de Vinci entre 1503 et 1519. Il est exposé au musée du Louvre à Paris, protégé derrière une vitre blindée. Le modèle serait Lisa Gherardini, épouse d'un riche marchand florentin. C'est l'œuvre d'art la plus visitée au monde, attirant chaque année plusieurs millions de visiteurs."
        ),
        Question(
            text = "En quelle année a eu lieu la Révolution française ?",
            options = listOf("1776", "1804", "1789", "1815"),
            correctIndex = 2,
            rating = 750,
            explanation = "La Révolution française débuta en 1789 avec la prise de la Bastille le 14 juillet, événement commémoré chaque année comme fête nationale en France. Elle mit fin à la monarchie absolue et aboutit à la Déclaration des droits de l'homme et du citoyen. Cette période bouleversa profondément la société française et influença durablement le monde entier."
        ),
        Question(
            text = "Quel est le plus grand océan du monde ?",
            options = listOf("Atlantique", "Indien", "Arctique", "Pacifique"),
            correctIndex = 3,
            rating = 900,
            explanation = "L'océan Pacifique est le plus grand et le plus profond des océans, couvrant environ 165 millions de km², soit plus que toutes les terres émergées réunies. Son nom lui fut donné par l'explorateur Magellan qui le trouva calme lors de sa traversée en 1520. Il abrite la fosse des Mariannes, le point le plus profond de la Terre à 11 034 m."
        ),
        Question(
            text = "Combien de côtés a un hexagone ?",
            options = listOf("6", "5", "7", "8"),
            correctIndex = 0,
            rating = 600,
            explanation = "Un hexagone est un polygone à 6 côtés et 6 angles. La France est d'ailleurs surnommée \"l'Hexagone\" en raison de la forme approximativement hexagonale de son territoire métropolitain. Un hexagone régulier possède tous ses côtés et angles égaux ; la somme de ses angles intérieurs est de 720°. On retrouve cette forme dans les alvéoles construites par les abeilles."
        ),
        Question(
            text = "Qui a écrit \"Les Misérables\" ?",
            options = listOf("Émile Zola", "Victor Hugo", "Honoré de Balzac", "Gustave Flaubert"),
            correctIndex = 1,
            rating = 800,
            explanation = "Les Misérables est un roman de Victor Hugo publié en 1862. Il raconte l'histoire de Jean Valjean, un ancien forçat cherchant à se racheter dans une France du XIXe siècle marquée par la misère et l'injustice. L'œuvre a été adaptée en comédie musicale en 1980, devenue l'une des plus jouées au monde. Hugo l'écrivit en grande partie en exil, notamment à Guernesey."
        ),
        Question(
            text = "Quel est l'élément chimique dont le symbole est \"Au\" ?",
            options = listOf("Argent", "Aluminium", "Or", "Azote"),
            correctIndex = 2,
            rating = 1100,
            explanation = "Le symbole chimique \"Au\" vient du latin \"aurum\", qui signifie or. L'or est un métal précieux de numéro atomique 79, résistant à la corrosion et à l'oxydation. Utilisé depuis l'Antiquité pour la joaillerie et la monnaie, il est aujourd'hui indispensable en électronique de précision. Chaque smartphone contient de petites quantités d'or dans ses circuits."
        ),
        Question(
            text = "Sur quel continent se trouve le désert du Sahara ?",
            options = listOf("Asie", "Australie", "Amérique du Sud", "Afrique"),
            correctIndex = 3,
            rating = 650,
            explanation = "Le désert du Sahara se trouve en Afrique du Nord. Avec environ 9 millions de km², c'est le plus grand désert chaud du monde. Contrairement aux idées reçues, seulement 25% de sa surface est couverte de dunes de sable ; le reste est principalement composé de roches et de gravier. Il s'étend sur onze pays africains, dont l'Algérie, l'Égypte, le Mali ou le Tchad."
        ),
        Question(
            text = "Quelle planète est la plus proche du Soleil ?",
            options = listOf("Mercure", "Vénus", "Mars", "Terre"),
            correctIndex = 0,
            rating = 850,
            explanation = "Mercure est la planète la plus proche du Soleil, à une distance moyenne de 57,9 millions de km. Malgré cela, Mercure n'est pas la planète la plus chaude : c'est Vénus, dont l'épaisse atmosphère génère un fort effet de serre maintenant une température moyenne de 462°C. Mercure connaît quant à elle des extrêmes allant de −180°C la nuit à +430°C le jour."
        ),
        Question(
            text = "Combien de joueurs composent une équipe de football ?",
            options = listOf("9", "11", "13", "10"),
            correctIndex = 1,
            rating = 650,
            explanation = "Une équipe de football est composée de 11 joueurs sur le terrain : 1 gardien de but et 10 joueurs de champ. Le football est le sport le plus populaire au monde avec environ 4 milliards de fans et 265 millions de pratiquants. Les règles modernes du jeu ont été codifiées en Angleterre en 1863 par la Football Association."
        ),
        Question(
            text = "Qui a inventé le téléphone ?",
            options = listOf("Thomas Edison", "Nikola Tesla", "Alexander Graham Bell", "Guglielmo Marconi"),
            correctIndex = 2,
            rating = 1050,
            explanation = "Alexander Graham Bell obtint le premier brevet du téléphone en 1876. L'invention est néanmoins controversée : l'Italien Antonio Meucci avait déposé une pré-demande de brevet dès 1871, mais n'avait pas les moyens de la renouveler. En 2002, le Congrès américain a officiellement reconnu la contribution de Meucci à l'invention du téléphone."
        ),
        Question(
            text = "Quel est le fleuve le plus long du monde ?",
            options = listOf("Amazone", "Mississippi", "Yangtsé", "Nil"),
            correctIndex = 3,
            rating = 1200,
            explanation = "Le Nil est traditionnellement considéré comme le fleuve le plus long du monde avec 6 650 km, devant l'Amazone (6 400 km). Cette classification est toutefois sujette à débat selon les critères de mesure utilisés — certaines études récentes accordent la première place à l'Amazone. Le Nil traverse onze pays africains et fut le berceau de la civilisation égyptienne."
        ),
        Question(
            text = "Quelle est la formule chimique de l'eau ?",
            options = listOf("H₂O", "CO₂", "NaCl", "O₂"),
            correctIndex = 0,
            rating = 650,
            explanation = "La molécule d'eau est composée de deux atomes d'hydrogène (H) et d'un atome d'oxygène (O), d'où la formule H₂O. L'eau est la seule substance naturelle présente en abondance dans les trois états de la matière sur Terre. Elle couvre environ 71% de la surface de notre planète, mais seulement 2,5% est de l'eau douce, dont la majeure partie est piégée dans les glaces polaires."
        ),
        Question(
            text = "Qui a découvert la pénicilline ?",
            options = listOf("Louis Pasteur", "Alexander Fleming", "Marie Curie", "Albert Einstein"),
            correctIndex = 1,
            rating = 1050,
            explanation = "La pénicilline fut découverte par Alexander Fleming en 1928, par hasard, lorsqu'il observa qu'une moisissure (Penicillium notatum) inhibait la croissance de bactéries dans une boîte de Petri oubliée. Cette découverte révolutionna la médecine en permettant de traiter des infections jusque-là mortelles. Fleming, Howard Florey et Ernst Boris Chain reçurent le prix Nobel de médecine en 1945."
        ),
        Question(
            text = "Quelle est la monnaie officielle du Japon ?",
            options = listOf("Yuan", "Won", "Yen", "Ringgit"),
            correctIndex = 2,
            rating = 950,
            explanation = "Le yen est la monnaie officielle du Japon depuis 1871. Son symbole est ¥ et son code ISO est JPY. Le mot \"yen\" signifie \"objet rond\" en japonais, en référence aux anciennes pièces de monnaie. Le yen est l'une des trois monnaies les plus échangées au monde, après le dollar américain et l'euro."
        ),
    )
}