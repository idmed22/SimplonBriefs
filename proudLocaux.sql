PGDMP     '    ;    
            z           PRODUITS LOCAUX    14.3    14.3                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            	           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            
           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    16409    PRODUITS LOCAUX    DATABASE     m   CREATE DATABASE "PRODUITS LOCAUX" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'French_France.1252';
 !   DROP DATABASE "PRODUITS LOCAUX";
                postgres    false            ?            1259    16433    admins    TABLE     S   CREATE TABLE public.admins (
    admin_id integer NOT NULL,
    user_id integer
);
    DROP TABLE public.admins;
       public         heap    postgres    false            ?            1259    16423    clients    TABLE     U   CREATE TABLE public.clients (
    client_id integer NOT NULL,
    user_id integer
);
    DROP TABLE public.clients;
       public         heap    postgres    false            ?            1259    16443    produits    TABLE     ?   CREATE TABLE public.produits (
    produit_id integer NOT NULL,
    nom character varying(50),
    prix integer,
    quantite integer,
    la_date date,
    user_id integer
);
    DROP TABLE public.produits;
       public         heap    postgres    false            ?            1259    16418    users    TABLE     ?   CREATE TABLE public.users (
    user_id integer NOT NULL,
    nom character varying(10),
    prenom character varying(10),
    adresse character varying(30)
);
    DROP TABLE public.users;
       public         heap    postgres    false            ?            1259    16453    voter    TABLE     Z   CREATE TABLE public.voter (
    date_vote date,
    produit_vote character varying(40)
);
    DROP TABLE public.voter;
       public         heap    postgres    false                      0    16433    admins 
   TABLE DATA           3   COPY public.admins (admin_id, user_id) FROM stdin;
    public          postgres    false    211   ?                 0    16423    clients 
   TABLE DATA           5   COPY public.clients (client_id, user_id) FROM stdin;
    public          postgres    false    210   ?                 0    16443    produits 
   TABLE DATA           U   COPY public.produits (produit_id, nom, prix, quantite, la_date, user_id) FROM stdin;
    public          postgres    false    212                    0    16418    users 
   TABLE DATA           >   COPY public.users (user_id, nom, prenom, adresse) FROM stdin;
    public          postgres    false    209   D                 0    16453    voter 
   TABLE DATA           8   COPY public.voter (date_vote, produit_vote) FROM stdin;
    public          postgres    false    213   ?       p           2606    16437    admins admins_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.admins
    ADD CONSTRAINT admins_pkey PRIMARY KEY (admin_id);
 <   ALTER TABLE ONLY public.admins DROP CONSTRAINT admins_pkey;
       public            postgres    false    211            n           2606    16427    clients clients_pkey 
   CONSTRAINT     Y   ALTER TABLE ONLY public.clients
    ADD CONSTRAINT clients_pkey PRIMARY KEY (client_id);
 >   ALTER TABLE ONLY public.clients DROP CONSTRAINT clients_pkey;
       public            postgres    false    210            r           2606    16447    produits produits_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.produits
    ADD CONSTRAINT produits_pkey PRIMARY KEY (produit_id);
 @   ALTER TABLE ONLY public.produits DROP CONSTRAINT produits_pkey;
       public            postgres    false    212            l           2606    16422    users users_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (user_id);
 :   ALTER TABLE ONLY public.users DROP CONSTRAINT users_pkey;
       public            postgres    false    209            t           2606    16438    admins admins_user_id_fkey    FK CONSTRAINT     ~   ALTER TABLE ONLY public.admins
    ADD CONSTRAINT admins_user_id_fkey FOREIGN KEY (user_id) REFERENCES public.users(user_id);
 D   ALTER TABLE ONLY public.admins DROP CONSTRAINT admins_user_id_fkey;
       public          postgres    false    209    3180    211            s           2606    16428    clients clients_user_id_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.clients
    ADD CONSTRAINT clients_user_id_fkey FOREIGN KEY (user_id) REFERENCES public.users(user_id);
 F   ALTER TABLE ONLY public.clients DROP CONSTRAINT clients_user_id_fkey;
       public          postgres    false    3180    210    209            u           2606    16448    produits produits_user_id_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.produits
    ADD CONSTRAINT produits_user_id_fkey FOREIGN KEY (user_id) REFERENCES public.users(user_id);
 H   ALTER TABLE ONLY public.produits DROP CONSTRAINT produits_user_id_fkey;
       public          postgres    false    212    3180    209                  x?31?4?????? ?Z            x?35?4?????? ?[         '   x?3?,N,???42?46 ?FF???F??1~\1z\\\ ~M?         ?   x?]?=?0??>EO?H??????6W?lC?Ti
ROO'????????????p`??????B??pL??W??k??PHĒ???cW?Xh?7`?/??n?S?_:??H???-?I????_??QR4K?ӳh?<??????#?˼????el6(????+[c            x?3202?50?54?,???M?????? 7??     