# Cas 4
Utilisation de l'attribut loading="lazy" de la balise image pour ne charger que les images qui vont être affichées à l'utilisateur.

Le lazy loading s'apparente au patron de conception Procuration (virtuelle). Il permet de créer un objet en diféré au lieu de le créer au lancement de l'application. 
Le principe est de créer une interface commune entre la "vraie" classe qui contient la logique métier et la classe de procuration. Cette interface permet de passer au client aussi bien une instance de la "vraie" classe qu'une instance de la classe de procuration.

Le rôle de la classe de procuration est de gérer et de contrôler l'accès aux méthodes de la "vraie" classe. 
Ce qui permettrait par exemple de ne pas instancier ou d'utiliser une méthode de la "vraie" classe si on n'en a pas encore besoin.

Dans le dossier assets vous trouverez deux captures d'écran illustrant les explications ci-dessus. Le trafic [au chargment de la page](./assets/coo_seance3_load01.png) et [le trafic au défilement de la page](./assets/coo_seance3_load02.png).
On peut y voir qu'au chargement initiale de la page seule quelques images sont chargées (8/11). Puis, au défilement de la page, les 3 dernières sont chargées.