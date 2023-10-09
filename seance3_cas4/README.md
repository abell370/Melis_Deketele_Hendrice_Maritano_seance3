# Cas 4
Utilisation de l'attribut loading="lazy" de la balise image pour ne charger que les images qui vont être affichées à l'utilisateur.

Pour mettre en place du lazy loading dans une application, le patron de conception Procuration peut être mis en place. Il permet de créer un objet en diféré au lieu de le créer au lancement de l'application. 
Le principe est de créer une interface commune entre la "vraie" classe qui contient la logique métier et la classe de procuration. Cette interface permet de passer au client aussi bien une instance de la "vraie" classe qu'une instance de la classe de procuration.

Le rôle de la classe de procuration est de gérer et de contrôler l'accès aux méthodes de la "vraie" classe. 
Ce qui permettrait par exemple de ne pas instancier ou d'utiliser une méthode de la "vraie" classe si on n'en a pas encore besoin.

Dans le dossier assets vous trouverez deux captures d'écran illustrant les explications ci-dessus. Le trafic [au chargment de la page](./assets/coo_seance3_load01.png) et [le trafic au défilement de la page](./assets/coo_seance3_load02.png).
On peut y voir qu'au chargement initiale de la page seule quelques images sont chargées (8/11). Puis, au défilement de la page, les 3 dernières sont chargées.

Alternative:

Dans l'environnement web, le fait de charger une image uniquement lorsque l'utilisateur va la voir s'apparente au patron de coneption Observateur. Ce patron de conception se base sur des abonnés qui vont être notifiés à chaque fois que l'évènement auxquels ils se sont abonnés survient. Ces évènements quant à eux seront lancés par des publieurs. 
Pour la page web, les images jouent le rôle des abonnés et vont réagir à l'évènement indiquant qu'elle vont être dans la zone d'affichage pour se charger. Le publieur içi c'est le DOM de la page web. Son rôle va être de déterminer si une image va être ou non dans la zone d'affichage. Si une image va être dans cette zone, il lance l'évènement pour indiqué aux abonnés de cet évènement qu'elles doivent se charger. 