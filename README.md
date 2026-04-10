# 📱 Android Fragments Lab

![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)

Ce projet est une démonstration technique de la gestion des **Fragments** sous Android. Le contenu est **100% Java et Android Natif**, conçu pour illustrer la manipulation dynamique de l'interface utilisateur.

## 🛠️ Stack Technique
* **Langage :** Java (Android SDK)
* **Interface :** XML natif (LinearLayout, FrameLayout)
* **Architecture :** Single Activity Pattern avec `FragmentManager`.

## 🚀 Fonctionnalités Clés
1. **Navigation Dynamique** : Alternance entre fragments sans recharger l'activité parente.
2. **Gestion de la Pile (BackStack)** : Support du bouton "Retour" physique pour une navigation fluide.
3. **Logique Interactive** :
    * **Fragment 1** : Interaction simple (Bouton -> Mise à jour de texte).
    * **Fragment 2** : Utilisation d'une `SeekBar` pour un contrôle de données en temps réel.
4. **Monitoring** : Suivi des états du cycle de vie (`onResume`, `onPause`) via Logcat.

## 🎥 Démonstration Vidéo
Découvrez le fonctionnement de l'application (navigation, clics et SeekBar) dans cette vidéo :

https://github.com/4n4s2l2rn/LAB4/raw/main/record/Recording.gif

---

### 📥 Installation & Test
1. Cloner le dépôt : `git clone https://github.com/4n4s2l2rn/LAB4.git`
2. Ouvrir le projet dans **Android Studio**.
3. Lancer l'application sur un émulateur ou un appareil physique.
4. Filtrer le **Logcat** avec le mot-clé `CycleDeVie` pour observer le comportement des fragments.
