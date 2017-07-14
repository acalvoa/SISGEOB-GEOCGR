package gea.model;
import java.util.ArrayList;

import gea.annotation.*;
import gea.types.CENTROID;
import gea.types.GEOM;
import gea.types.PRESITIONGEOM;
@ModelParam(
		tableName="CLASIFICACIONES",
		Find=true,
		FindOne=true,
		Update=true,
		Delete=true,
		ToJSON=true
)
public class ModelClasificaciones extends ModelBase{
	//DEFINIMOS LOS STRIBUTOS
	@ModelField
	public String NOMBRE;
	@ModelField
	public int NUMERO;
	
	/*
	 *	FUNCION DE TRANSFORMACION A TEXTO JSON HEREDA LA ESTRUCTURA COMPLETA DE CAMPOS
	 *	EN ESTE PUNTO A TRAVES DEL CODIGO REMOVE SE PUEDEN EXTRAER LOS CAMPOS QUE NO SE REQUIERAN
	 *	A LA HORA DE EXPORTAR LOS DATOS A FORMATO JSON
	 */
	@Override
	protected void toJSON(ArrayList<String> mapa){
	}
}