# Cas 4
Utilisation de l'attribut loading="lazy" de la balise image pour ne charger que les images qui vont être affichées à l'utilisateur.
Le lazy loading s'apparente au patron de conception Observer du GoF. 

Ce patron de conception est basé sur un système d'abonnement à des évènements et permet à un objet d'être notifié quand l'évènement auquel il est abonné est émit par un autre objet.
Ce patron de conception est donc composé de 2 éléments principaux: les abonnées et les émetteurs.

Dans notre cas, les balises <img> ont le rôle des abonnés et le DOM de la page a le rôle de l'émetteur. Chaque balise va s'abonner à un évènement indiquant qu'elles vont être affichées à l'utilisateur. Le DOM quand à lui, va détecter les balises qui vont être affichées et va émettre les évènements associés. 

Dans le dossier assets vous trouverez deux captures d'écran illustrant les explications ci-dessus. Le trafic [au chargment de la page](./assets/coo_seance3_load01.png) et [le trafic au défilement de la page](./assets/coo_seance3_load02.png).
On peut y voir qu'au chargement initiale de la page seule quelques images sont chargées (8/11). Puis, au défilement de la page, les 3 dernières sont chargées.