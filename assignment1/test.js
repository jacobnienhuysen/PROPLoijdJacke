function createClass(className, superClassList){
	
	var nyKlass = {
		"new" : function() {
			return this;
		},
		"call" : function(funcName, parameters) {
			if(funcName in this){
				this[funcName](parameters);
			}
			else{
				if(undefined != this.superClasses){
					for(var i=0; i<this.superClasses.length; i++){
						this.superClasses[i].call(funcName, parameters);
					}
				}
			}
		},
		
		name : className,
		
		superClasses : superClassList,
		
		toString : function () {
			return this.name + "<br>" + this.superClasses;
		},
		
	};
	
	return nyKlass;

}