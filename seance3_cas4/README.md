# Cas 4
Utilisation de l'attribut loading="lazy" de la balise image pour ne charger que les images qui vont être affichées à l'utilisateur.

Le lazy loading s'apparente au patron de conception Procuration

Dans le dossier assets vous trouverez deux captures d'écran illustrant les explications ci-dessus. Le trafic [au chargment de la page](./assets/coo_seance3_load01.png) et [le trafic au défilement de la page](./assets/coo_seance3_load02.png).
On peut y voir qu'au chargement initiale de la page seule quelques images sont chargées (8/11). Puis, au défilement de la page, les 3 dernières sont chargées.