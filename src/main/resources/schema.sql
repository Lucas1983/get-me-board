-- Table: public.board
-- DROP TABLE public.board;
CREATE TABLE public.board
(
    id bigint NOT NULL,
    brand character varying(255) COLLATE pg_catalog."default",
    flex character varying(255) COLLATE pg_catalog."default",
    level character varying(255) COLLATE pg_catalog."default",
    model character varying(255) COLLATE pg_catalog."default",
    year integer,
    base character varying(255) COLLATE pg_catalog."default",
    core character varying(255) COLLATE pg_catalog."default",
    profile character varying(255) COLLATE pg_catalog."default",
    shape character varying(255) COLLATE pg_catalog."default",
    type character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT board_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.board
    OWNER to postgres;

-- Table: public.bindings
-- DROP TABLE public.bindings;
CREATE TABLE public.bindings
(
    id bigint NOT NULL,
    brand character varying(255) COLLATE pg_catalog."default",
    flex character varying(255) COLLATE pg_catalog."default",
    level character varying(255) COLLATE pg_catalog."default",
    model character varying(255) COLLATE pg_catalog."default",
    year integer,
    strap character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT bindings_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.bindings
    OWNER to postgres;

-- Table: public.boots
-- DROP TABLE public.boots;
CREATE TABLE public.boots
(
    id bigint NOT NULL,
    brand character varying(255) COLLATE pg_catalog."default",
    flex character varying(255) COLLATE pg_catalog."default",
    level character varying(255) COLLATE pg_catalog."default",
    model character varying(255) COLLATE pg_catalog."default",
    year integer,
    lacing character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT boots_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.boots
    OWNER to postgres;

-- Table: public.kit
-- DROP TABLE public.kit;
CREATE TABLE public.kit
(
    id bigint NOT NULL,
    bindings_fk bigint,
    board_fk bigint,
    boots_fk bigint,
    rider_fk bigint,
    CONSTRAINT kit_pkey PRIMARY KEY (id),
    CONSTRAINT fk3new0w2qgrimcmowpsoi5o2eo FOREIGN KEY (boots_fk)
        REFERENCES public.boots (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fk5i77md2aq1h93cabtm4j5wy10 FOREIGN KEY (rider_fk)
        REFERENCES public.rider (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fkgx2fi563av6292onxwxi44gmn FOREIGN KEY (bindings_fk)
        REFERENCES public.bindings (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fkqj18v0trgreqm0tsc95je0m1d FOREIGN KEY (board_fk)
        REFERENCES public.board (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.kit
    OWNER to postgres;

-- Table: public.rider
-- DROP TABLE public.rider;
CREATE TABLE public.rider
(
    id bigint NOT NULL,
    first_name character varying(255) COLLATE pg_catalog."default",
    last_name character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT rider_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.rider
    OWNER to postgres;